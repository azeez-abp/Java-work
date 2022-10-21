package design_pattern.creational.abstract_fsctory;
//2 create abstract factory
abstract class AbstractFactory{
    public abstract Bank getBank(String bank);/// this point to interface implemented by some concrete classes (you will know this by return type)
    public abstract Loan getLoan(String loan);
    //each method will point to interphase implemented by other classes  or Abstract class or class extended by many child class
}