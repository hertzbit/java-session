package interfaces;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UtilFunctionDemo {

    public static void main(String[] args) {

        Predicate<Integer> passTest = marks -> marks >= 40;

        System.out.println(passTest.test(100));
        System.out.println(passTest.test(50));
        System.out.println(passTest.test(40));
        System.out.println(passTest.test(38));

        IPhone iphone13 = new IPhone("13", 256, "Red");
        IPhone iphone12 = new IPhone("12", 128, "Green");

        Consumer<IPhone> printIPhoneDetails = iphone -> {
            System.out.println(iphone.getColor());
            System.out.println(iphone.getMemory());
            System.out.println(iphone.getModel());
        };

        printIPhoneDetails.accept(iphone12);

        Supplier<IPhone> iPhoneSupplier = () -> iphone13;
        printIPhoneDetails.accept(iPhoneSupplier.get());

        Function<Integer, Integer> squareFunction = num -> num * num;

        System.out.println(squareFunction.apply(22));
    }
}


class IPhone {

    private String model;
    private int memory;
    private String color;

    public IPhone(String model, int memory, String color) {
        this.model = model;
        this.memory = memory;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
