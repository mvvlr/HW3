package com.company;

public class LimitExeption extends Exception {
    private double remainingAmount;
    public LimitExeption(String message, double remainingAmount ) {
        super(message);
    this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount(){
        return remainingAmount;

    }
    public void setRemainingAmount(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }
}
