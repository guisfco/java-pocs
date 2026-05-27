package com.guisfco;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.AdditionalAnswers;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class) // Automatically initialize and manage Mockito annotations during test execution. Equivalent to MockitoAnnotations.openMocks(this) (manual approach)
class PaymentServiceTest {

    @InjectMocks
    // To inject mock fields into the tested object automatically. Otherwise, we have to manually call the constructor
    private PaymentService paymentService;

    @Mock // Used to create and inject mocked instances without having to call Mockito.mock(...) manually
    private PaymentRepository paymentRepository;

    @Spy // Allow us to use a real instance and execute real methods, and still mock specific methods
    private PaymentValidationService paymentValidationService;

    @Mock
    private EmailNotificationClient notificationClient;

    @Mock
    private FraudClientImpl fraudClient;

    @Test
    void whenCreatePaymentSuccessfullyThenReturnSavedPayment() {
        when(paymentRepository.save(any())).thenAnswer(AdditionalAnswers.returnsFirstArg());

        var savedPayment = assertDoesNotThrow(() -> paymentService.create(BigDecimal.TEN));

        var paymentArgumentCaptor = ArgumentCaptor.forClass(Payment.class);

        verify(paymentValidationService).validate(paymentArgumentCaptor.capture());
        verifyNoInteractions(notificationClient, fraudClient);

        assertEquals(paymentArgumentCaptor.getValue(), savedPayment);
        assertNotNull(savedPayment.id());
        assertEquals(BigDecimal.TEN, savedPayment.amount());
        assertEquals(PaymentStatus.CREATED, savedPayment.status());
    }

    @Test
    void whenApprovingPaymentButPaymentNotFoundThenThrowException() {
        var paymentId = UUID.randomUUID();

        when(paymentRepository.findById(paymentId)).thenReturn(Optional.empty());

        assertThrows(IllegalArgumentException.class, () -> paymentService.approve(paymentId));

        verify(paymentRepository, never()).save(any());
        verifyNoInteractions(notificationClient, fraudClient);
    }

    @Test
    void whenApprovingFraudulentPaymentThenThrowException() {
        var paymentId = UUID.randomUUID();
        var payment = new Payment(paymentId, BigDecimal.TEN, PaymentStatus.CREATED);

        when(paymentRepository.findById(paymentId)).thenReturn(Optional.of(payment));
        when(fraudClient.isFraud(payment)).thenReturn(true);

        assertThrows(IllegalStateException.class, () -> paymentService.approve(paymentId));

        verify(fraudClient).isFraud(payment);
        verify(paymentRepository, never()).save(any());
        verifyNoInteractions(notificationClient);
    }

    @Test
    void whenApprovingValidPaymentThenReturnApprovedPayment() {
        var paymentId = UUID.randomUUID();
        var payment = new Payment(paymentId, BigDecimal.TEN, PaymentStatus.CREATED);

        when(paymentRepository.findById(paymentId)).thenReturn(Optional.of(payment));
        when(fraudClient.isFraud(payment)).thenReturn(false);
        when(paymentRepository.save(any())).thenAnswer(AdditionalAnswers.returnsFirstArg());

        var approvedPayment = assertDoesNotThrow(() -> paymentService.approve(paymentId));

        assertEquals(payment.id(), approvedPayment.id());
        assertEquals(PaymentStatus.APPROVED, approvedPayment.status());
        assertEquals(payment.amount(), approvedPayment.amount());

        verify(fraudClient).isFraud(payment);
        verify(paymentRepository).save(any());
        verify(notificationClient).notifyPaymentApproved(approvedPayment);
    }

    @Test
    void whenDeletingPaymentThenDeleteCorrectId() {
        var paymentId = UUID.randomUUID();

        assertDoesNotThrow(() -> paymentService.delete(paymentId));

        verify(paymentRepository).deleteById(paymentId);
    }

}