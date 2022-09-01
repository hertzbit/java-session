package interfaces;

interface Flyable {

    void fly();
}

/*class FlyableDuck implements Flyable {

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}*/

public class LambdaExpressionsDemo {

    public static void main(String[] args) {

        Flyable flyableDuck = () -> System.out.println("I can fly");

        flyableDuck.fly();

        Flyable flyableSparrow = () -> {
            System.out.println("Sparrows can fly");
        };

        flyableSparrow.fly();

        /*
        FlyableDuck flyableDuck = new FlyableDuck();

        //flyableDuck.fly();
        System.out.println(flyableDuck.toString());
        Flyable flyableSparrow = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Sparrows can fly");
            }
        };
        System.out.println(flyableSparrow.toString());
        //flyableSparrow.fly();

        Flyable flyableSwan = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Swans can fly");
            }
        };
        System.out.println(flyableSwan.toString());
        */
    }
}
