package design_pattern.creational.builder.concrete;

public class Case implements design_pattern.creational.builder.Case {

    @Override
    public String material(String materials) {
        return materials;
    }

    @Override
    public double dimension(double x, double y) {
        return x*y;
    }

    public void getcase(){
        System.out.println("Case Material is "+this.material("Silicon doped Plastic")+ " and diemsion is "+ this.dimension(3000.45,200.23));
    }
}
