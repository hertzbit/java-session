package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Car {

    private String model;
    private Integer fuelCapacity;

    public Car() {
    }

    public Car(String model, Integer fuelCapacity) {
        this.model = model;
        this.fuelCapacity = fuelCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(Integer fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}

class CarComparator implements Comparator<Car> {

    /*
    ..
    ..
    .
    .
    .
     */
    @Override
    public int compare(Car carOne, Car carTwo) {
        return carOne.getFuelCapacity().compareTo(carTwo.getFuelCapacity());
    }
}

public class MethodReferenceTest {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        integerList.forEach(System.out::println);
        CarComparator carComparator = new CarComparator();

        List<String> carModels = Arrays.asList("Model S", "Model 3", "Model X", "Model Y");

        List<Car> carList = new ArrayList<>();
        carList.stream().sorted(carComparator::compare).forEach(System.out::println);
    }
}
