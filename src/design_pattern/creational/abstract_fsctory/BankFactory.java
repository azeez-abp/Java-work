package design_pattern.creational.abstract_fsctory;
///3 Create factory class of each interface those are implemented  and Abstract class  those are extended
import design_pattern.creational.abstract_fsctory.concrete.HDFC;
import design_pattern.creational.abstract_fsctory.concrete.ICICI;
import design_pattern.creational.abstract_fsctory.concrete.SBI;

class BankFactory extends AbstractFactory{
    public Bank getBank(String bank){
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("HDFC")){
            return new HDFC();
        } else if(bank.equalsIgnoreCase("ICICI")){
            return new  ICICI();
        } else if(bank.equalsIgnoreCase("SBI")){
            return new SBI();
        }
        return null;
    }
    public Loan getLoan(String loan) {
        return null;
    }
}//End of the BankFactory class