package design_pattern.creational.factory.concrete;

import design_pattern.creational.factory.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("I draw Rectangle");
    }

    @Override
    public void get() {

    }
}
