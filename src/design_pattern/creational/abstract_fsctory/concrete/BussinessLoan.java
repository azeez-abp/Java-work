package design_pattern.creational.abstract_fsctory.concrete;

import design_pattern.creational.abstract_fsctory.Loan;

public class BussinessLoan  extends Loan {


    @Override
    public double getRate(double r) {
        double rate = r;
        return rate;
    }
}
