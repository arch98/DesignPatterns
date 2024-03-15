import ShapeFactory.ShapeFactory;

import ShapeFactory.Circle;
import ShapeFactory.Rectangle;

public class Shape {

    ShapeFactory getShape(String input){
        switch (input){
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }

}
