package design_pattern.creational.singleton;

class ALazy{
    private static ALazy obj;
    private ALazy(){}

    public static ALazy getA(){
        if (obj == null){
            synchronized(ALazy.class){
                if (obj == null){
                    obj = new ALazy();//instance will be created at request time
                }
            }
        }
        return obj;
    }

    public void doSomething(){
        //write your code
    }
}