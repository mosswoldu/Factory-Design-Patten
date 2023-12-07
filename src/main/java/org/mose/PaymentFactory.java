package org.mose;

import java.text.MessageFormat;

public class PaymentFactory {
    public static Payment create(PaymentMethod paymentMethod) throws ClassNotFoundException {
        switch (paymentMethod) {
            case CREDITCARD -> {
                return new CreditCardPayment();
            }
//            case PAYPAL -> {
//                return new PayPalPayment();
//            }
//            case GOOGLEPAY -> {
//                return new GooglePayPayment();
//            }
//            case APPLEPAY -> {
//                return new ApplePayPayment();
//            }
            default -> throw new ClassNotFoundException(MessageFormat.format(
                    "{0} is not currently supported as a payment method.", paymentMethod
            ));
        }
    }}
