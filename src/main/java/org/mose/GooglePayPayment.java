package org.mose;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class GooglePayPayment implements Payment{
    @Override
    public void pay(double amount) {

                System.out.println(MessageFormat.format(
                        "Successfully paid ${0} to merchant using GooglePal", amount));
            }
        }