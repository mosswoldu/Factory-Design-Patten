package org.mose;

import java.math.BigDecimal;

public class PaymentProcessor {
    public static void main(String[] args) throws ClassNotFoundException {

        try {
            Payment creditCardpayment=PaymentFactory.create(PaymentMethod.CREDITCARD);
            creditCardpayment.pay((1000));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}