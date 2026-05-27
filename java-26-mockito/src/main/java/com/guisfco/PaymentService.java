package com.guisfco;

import java.math.BigDecimal;
import java.util.UUID;

public class PaymentService {

    private final PaymentValidationService paymentValidationService;
    private final PaymentRepository paymentRepository;
    private final NotificationClient notificationClient;
    private final FraudClient fraudClient;

    public PaymentService(PaymentValidationService paymentValidationService,
                          PaymentRepository paymentRepository,
                          NotificationClient notificationClient,
                          FraudClient fraudClient) {
        this.paymentValidationService = paymentValidationService;
        this.paymentRepository = paymentRepository;
        this.notificationClient = notificationClient;
        this.fraudClient = fraudClient;
    }

    public Payment create(BigDecimal amount) {
        var payment = new Payment(UUID.randomUUID(), amount, PaymentStatus.CREATED);
        paymentValidationService.validate(payment);
        return paymentRepository.save(payment);
    }

    public Payment approve(UUID id) {
        var payment = paymentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Payment not found"));

        if (fraudClient.isFraud(payment)) {
            throw new IllegalStateException("Fraud detected");
        }

        var approved = new Payment(payment.id(), payment.amount(), PaymentStatus.APPROVED);
        var saved = paymentRepository.save(approved);

        notificationClient.notifyPaymentApproved(saved);

        return saved;
    }

    public void delete(UUID id) {
        paymentRepository.deleteById(id);
    }
}