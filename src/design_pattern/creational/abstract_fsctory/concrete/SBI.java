package design_pattern.creational.abstract_fsctory.concrete;

import design_pattern.creational.abstract_fsctory.Bank;
public class SBI implements Bank {
    private final String BNAME;
    public SBI(){
        BNAME="SBI BANK";
    }
    public String getBankName(){
        return BNAME;
    }
}
