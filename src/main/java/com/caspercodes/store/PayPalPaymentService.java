package com.caspercodes.store;

//@Service("paypal")
public class PayPalPaymentService implements  PaymentService {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with PayPal...");
        System.out.println("Payment of $" + amount + " processed successfully.");
    }
}
