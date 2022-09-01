package interfaces;

interface myInterface {

    void display();
    default void doSomething() {
        System.out.println("Doing Something");
    }

    static void draw() {
        System.out.println("Draw");
    }
}

class Printer implements myInterface {

    @Override
    public void display() {
        System.out.println("Printer :: Hello World");
    }
}

class MobileDisplay implements myInterface {

    @Override
    public void display() {
        System.out.println("Mobile Display :: Hello World");
    }
}
public class InterfaceDemo  {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.display();

        MobileDisplay mobileDisplay = new MobileDisplay();
        mobileDisplay.display();
        mobileDisplay.doSomething();

        myInterface.draw();
    }
}
