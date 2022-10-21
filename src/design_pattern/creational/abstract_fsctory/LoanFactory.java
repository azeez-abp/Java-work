package design_pattern.creational.abstract_fsctory;
///
import design_pattern.creational.abstract_fsctory.concrete.BussinessLoan;
import design_pattern.creational.abstract_fsctory.concrete.EducationLoan;
///3 Create factory class of each interface those are implemented  and Abstract class  those are extended
class LoanFactory extends AbstractFactory{
    //Note Each factory conatin method for each Abstract method
    public Bank getBank(String bank){
        return null;
    }

    public Loan getLoan(String loan){
        if(loan == null){
            return null;
        }
        if(loan.equalsIgnoreCase("Home")){
          //  return new HomeLoan();
        } else if(loan.equalsIgnoreCase("Business")){
            return new BussinessLoan();
        } else if(loan.equalsIgnoreCase("Education")){
            return new EducationLoan();
        }
        return null;
    }

}
