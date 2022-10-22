package design_pattern.creational.builder.concrete;

public class Computer {
    Factory computerFacvtory   = new Factory();

    public  void  buildComputer(){
        computerFacvtory.getCase().getcase();
        computerFacvtory.getScreen().getScreen();
        computerFacvtory.getMotherBoard().addDisk(2309.34);
        computerFacvtory.getMotherBoard().buildPanel();
        computerFacvtory.getMotherBoard().addRam();
    }
}
