package design_pattern.creational.builder;

import design_pattern.creational.builder.concrete.Computer;

public class ComputerBuilder {

    public static void  main(String[] args){
        Computer computer  = new Computer();
        computer.buildComputer();
    }
}
