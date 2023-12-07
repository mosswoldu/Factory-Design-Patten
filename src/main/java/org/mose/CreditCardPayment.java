package org.mose;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class CreditCardPayment implements Payment{
    double tax=0.05;
    @Override
    public void pay(double amount) {


        System.out.println(MessageFormat.format("Successfully paid ${0} to merchant using Credit Card", amount + amount*tax ));
    }
}
