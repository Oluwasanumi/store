package com.caspercodes.store;

//@Service
public class  OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService bean created");
    }

    public void placeOrder () {
        paymentService.processPayment(100.0);
    }
}
