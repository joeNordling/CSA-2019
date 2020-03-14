package com.example.makingclasses;

public class TaxArithmetic extends Arithmetic {

    public double calculateTax(double PurchaseAmount, double tax){
        return PurchaseAmount * (tax/100);
    }

    public double calculateTax(double tax){
        return (super.add()) * (tax/100);
    }
}
