package design_pattern.creational.abstract_fsctory.concrete;
import design_pattern.creational.abstract_fsctory.Bank;

public class ICICI implements Bank {
    public final String BNAME;
    public ICICI(){
        BNAME="ICICI BANK";

    }
    public String getBankName() {
        return BNAME;
    }
}