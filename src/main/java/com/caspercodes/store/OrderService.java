package com.caspercodes.store;

//@Service
public class  OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder () {
        paymentService.processPayment(100.0);
    }
}
