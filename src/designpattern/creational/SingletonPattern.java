package designpattern.creational;

class Singleton {

    private static Singleton object;

    private Singleton() {}

    public static Singleton getInstance() {
        if (object == null) {
            synchronized (Singleton.class) {
                object = new Singleton();
            }
        }
        return object;
    }
}

public class SingletonPattern {

    public static void main(String[] args) {

    }
}
