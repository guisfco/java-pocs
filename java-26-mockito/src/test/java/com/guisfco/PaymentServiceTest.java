package com.guisfco;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class) // Automatically initialize and manage Mockito annotations during test execution. Equivalent to MockitoAnnotations.openMocks(this) (manual approach)
class PaymentServiceTest {

    @InjectMocks
    // To inject mock fields into the tested object automatically. Otherwise, we have to manually call the constructor
    private PaymentService paymentService;

    @Mock // Used to create and inject mocked instances without having to call Mockito.mock(...) manually
    private PaymentRepository paymentRepository;

    @Spy // Allow us to use a real instance and execute real methods, and still mock specific methods
    private EmailNotificationClient notificationClient;

    @Test
    void test() {
        assertTrue(true);
    }

}