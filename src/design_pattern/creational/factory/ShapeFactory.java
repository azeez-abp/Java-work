package design_pattern.creational.factory;

import design_pattern.creational.factory.concrete.Circle;
import design_pattern.creational.factory.concrete.Rectangle;

public class ShapeFactory {

    ///create a method that create the instance of all the classes
    /// this method will be involke to get  instance of such class
    //use getShape method to get object of type shape
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

       }
        //else if(shapeType.equalsIgnoreCase("SQUARE")){
//            return new Square();
//        }

        return null;
    }

}



