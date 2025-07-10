package com.caspercodes.store;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout:3000}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with Stripe...");
        System.out.println("API URL " + apiUrl);
        System.out.println("Enabled: " + enabled);
        System.out.println("Timeout: " + timeout);
        System.out.println("Currencies: " + supportedCurrencies);
        System.out.println("Payment of $" + amount + " processed successfully.");
    }
}
