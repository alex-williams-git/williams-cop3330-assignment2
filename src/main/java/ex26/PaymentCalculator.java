/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Williams
 */

package ex26;
import java.lang.Math;

public class PaymentCalculator {

    private double APR;
    private double balance;
    private double monthly_payment;

    public PaymentCalculator()
    {
        this.APR = 0.0;
        this.balance = 0.0;
        this.monthly_payment = 0.0;
    }

    public PaymentCalculator(double APR, double balance, double monthly_payment)
    {
        this.APR = APR;
        this.balance = balance;
        this.monthly_payment = monthly_payment;
    }

    public double calculateMonthsUntilPaidOff()
    {
        double num_months;
        double APR_percent = APR / 100;
        double daily_rate = APR_percent / 365;

        num_months = -(1.0/30.0) * Math.log(1 + balance/monthly_payment * (1 - Math.pow(1+daily_rate, 30.0))) / Math.log(1 + daily_rate);
        num_months = Math.ceil(num_months);

        return num_months;
    }
}
