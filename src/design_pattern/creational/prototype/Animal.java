package design_pattern.creational.prototype;


public interface Animal extends Cloneable {

    public Animal makeCopy();

}

///or interface that  that return itself
interface Prototype {

    public Prototype getClone();

}//End of Prototype interface.