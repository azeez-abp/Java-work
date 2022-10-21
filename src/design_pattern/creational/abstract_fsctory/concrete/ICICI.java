package design_pattern.creational.abstract_fsctory.concrete;
import design_pattern.creational.abstract_fsctory.Bank;

class ICICI implements Bank {
    private final String BNAME;
    ICICI(){
        BNAME="ICICI BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}