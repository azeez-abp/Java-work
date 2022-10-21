package design_pattern.creational.abstract_fsctory;

public class Demo {

    public static void main(String[] args) {
          BankFactory bankFactory  = new BankFactory();
          LoanFactory loanFactory  = new LoanFactory();
          String name  =  bankFactory.getBank("ICICI").getBankName();//buy jsut supplying the name we get the concrete instance of the ICICI class
          System.out.println(name);
    }
}
