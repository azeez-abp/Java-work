package design_pattern.creational.builder.concrete;

public class Screen implements design_pattern.creational.builder.Screen {

    @Override
    public String material(String materials) {
       return  materials;
    }

    @Override
    public double dimension(double x, double y) {
        return x*y;
    }

    public void getScreen(){
        System.out.println("Screen Material is "+this.material("jelly doped Plastic")+ " and diemsion is "+ this.dimension(30900.45,200.23));
    }
}
