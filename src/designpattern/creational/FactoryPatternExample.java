package designpattern.creational;

interface Shape {

    void draw();
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {

    public void draw() {
        System.out.println("Drawing Square");
    }
}

class Triangle implements Shape {

    public void draw() {
        System.out.println("Drawing Triangle");
    }
}

class ShapeFactory {

    public static Shape createShape (String shapeType) {

        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        } else if (shapeType.equals("TRIANGLE")) {
            return new Triangle();
        } else {
            return null;
        }
    }
}

public class FactoryPatternExample {

    public static void main(String[] args) {
        Shape circle = ShapeFactory.createShape("CIRCLE");
        circle.draw();
    }
}
