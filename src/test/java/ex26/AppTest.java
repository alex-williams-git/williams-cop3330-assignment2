/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex26;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @org.junit.jupiter.api.Test

    public void testMain(){

        double balance = 5000;
        double APR = 12;
        double monthlyPayment = 100;

        PaymentCalculator paymentCalculator = new PaymentCalculator(APR, balance, monthlyPayment);

        double result = paymentCalculator.calculateMonthsUntilPaidOff();

        assertEquals(result, 70.0);
    }
}