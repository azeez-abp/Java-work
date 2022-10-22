package design_pattern.creational.builder.concrete;



public class Factory {

    public Case getCase(){
        return  new Case();
    }

    public MotherBoard getMotherBoard(){
        return  new MotherBoard();
    }

    public Screen getScreen(){
        return new Screen();
    }
}
