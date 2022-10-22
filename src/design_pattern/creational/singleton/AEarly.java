package design_pattern.creational.singleton;

class AEarly {
    private static AEarly obj=new AEarly();//Early, instance will be created at load time
    private AEarly(){} //private constructor connect to database

    public static AEarly getA(){
        return obj;
    }

    public void doSomething(){
        //write your code
    }
}
