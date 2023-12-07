package org.mose;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class PayPalPayment  implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println(MessageFormat
                .format("Successfully paid ${0} to merchant using PayPal", amount));

    }
}
