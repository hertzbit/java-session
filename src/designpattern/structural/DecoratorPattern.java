package designpattern.structural;

interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing : Rectangle");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing : Circle");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing : Square");
    }
}

abstract class ShapeDecorator implements Shape {

    Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}

class ColorShapeDecorator extends ShapeDecorator {

    public ColorShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        this.setColorOfTheShape(decoratedShape);
    }

    private void setColorOfTheShape(Shape decoratedShape) {
        System.out.println("Color of Shape : Purple");
    }
}

public class DecoratorPattern {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();

        circle.draw();
        System.out.println();

        Shape purpleCircle = new ColorShapeDecorator(circle);
        purpleCircle.draw();
    }
}
