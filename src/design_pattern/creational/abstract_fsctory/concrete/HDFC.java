package design_pattern.creational.abstract_fsctory.concrete;
import design_pattern.creational.abstract_fsctory.Bank;

public class HDFC implements Bank {
    private final String BNAME;
    public HDFC(){
        BNAME="HDFC BANK";
    }
    public String getBankName() {
        return BNAME;
    }
}
