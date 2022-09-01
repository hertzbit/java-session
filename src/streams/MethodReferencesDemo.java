package streams;

import java.util.function.Function;

interface MyInterface {


}
class MyClass {

    public static int someFunction (int numOne, Function<Integer, Integer> action) {

        return action.apply(numOne);
    }
}

public class MethodReferencesDemo {

    public static void display() {
        System.out.println("Using Method References");
    }

    public static void main(String[] args) {

        Function<Integer, Integer> squareFunction = num -> num * num;
        Function<Integer, Integer> cubeFunction = num -> num * num * num;

        System.out.println("Square of 8 is : " + MyClass.someFunction(8, squareFunction));
        System.out.println("Cube of 8 is : " + MyClass.someFunction(8, cubeFunction));

    }
}
