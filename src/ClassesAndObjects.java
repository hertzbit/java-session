class Car {

    int maxSpeed;
    String color;
    String engineType;

    public Car (int maxSpeedParam, String colorParam, String engineTypeParam) {

        super();
        this.maxSpeed = maxSpeedParam;
        this.color = colorParam;
        this.engineType = engineTypeParam;
    }

    void applyBrake() {
        System.out.println("Applying Brake");
    }

    void accelerate() {
        System.out.println("Accelerating ");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}

class Tesla extends Car {

    String modelNumber;
    double price;

    public Tesla (int maxSpeed, String color, String engineType, String modelNumber, double price) {

        super(maxSpeed, color, engineType);
        this.modelNumber = modelNumber;
        this.price = price;
    }

    public void printPrice() {
        System.out.println("Price : " + this.price);
    }

    @Override
    void accelerate() {
        System.out.println("Accelerating Tesla Vehicle");
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "modelNumber='" + modelNumber + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}

class Ford extends Car {

    String modelNumber;
    double price;

    public Ford (int maxSpeed, String color, String engineType, String modelNumber, double price) {

        super(maxSpeed, color, engineType);
        this.modelNumber = modelNumber;
        this.price = price;
    }

    public void printPrice() {
        System.out.println("Price : " + this.price);
    }

    @Override
    void accelerate() {
        System.out.println("Accelerating Ford Vehicle");
    }

    @Override
    public String toString() {
        return "Ford{" +
                "modelNumber='" + modelNumber + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
public class ClassesAndObjects {

    public static void main(String[] args) {

        Car myCar = new Car(120, "Black", "Electric");
        System.out.println(myCar);

        Tesla myTesla = new Tesla(150, "Red", "Electric",
                "Model X", 120000.00);

        Ford myFord = new Ford(180, "Blue", "Petrol",
                "Model E", 50000.00);

        System.out.println(myTesla);
        System.out.println(myFord);
        myTesla.accelerate();
        myFord.accelerate();
        myTesla.printPrice();

        System.out.println();
        System.out.println("*******************************************************");
        System.out.println();

        Car teslaCar = myTesla;
        Car fordCard = myFord;

        teslaCar.accelerate();
    }
}
