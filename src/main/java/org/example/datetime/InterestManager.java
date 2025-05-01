package org.example.datetime;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class InterestManager {
    private final double annualInterestRate = 13.17;

    public static void main(String[] args) {
        InterestManager manager = new InterestManager();
        manager.calculateInterest(new BigDecimal(1000), 10);
    }

    public void calculateInterest(BigDecimal principal, int duration) {
        double interest = (annualInterestRate/365)  * duration;
        System.out.println("interest is " + interest);
        BigDecimal multiply = principal.multiply(new BigDecimal(interest));
        multiply = multiply.setScale(2, BigDecimal.ROUND_DOWN);

        System.out.printf("Your investment will yield %s in interest, payable on %s", multiply, LocalDate.now().plus(duration, ChronoUnit.DAYS));
    }
}
