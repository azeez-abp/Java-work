package design_pattern.creational.factory.concrete;

import design_pattern.creational.factory.Shape;

public class Circle  implements Shape {
    @Override
    public void draw() {
      System.out.println("I draw Circle");
    }

    @Override
    public void get() {
        System.out.println("Take Circle");
    }
}
