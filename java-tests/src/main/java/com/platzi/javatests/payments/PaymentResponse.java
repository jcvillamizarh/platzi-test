package com.platzi.javatests.payments;

public class PaymentResponse {

    enum PaymentStatus {
        OK, ERROR
    }

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
    private PaymentStatus status;
}
