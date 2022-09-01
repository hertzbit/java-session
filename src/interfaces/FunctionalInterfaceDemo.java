package interfaces;

@FunctionalInterface
interface Sum {

    int addTwoNumbers (int numOne, int numTwo);
}

@FunctionalInterface
interface Display {

    void display();
}

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        Sum sum = (a, b) -> a + b;

        Display printer = () -> System.out.println("I am printer");
        Display mobileDisplay = () -> System.out.println("I am a mobile display");

        printer.display();
        mobileDisplay.display();
    }
}
