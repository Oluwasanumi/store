package com.caspercodes.store;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Service
public class  OrderService {

    private final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService bean created");
    }

    @PostConstruct
    public void init() {
        System.out.println("OrderService post construct");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("OrderService clean up");
    }

    public void placeOrder () {
        paymentService.processPayment(100.0);
    }
}
