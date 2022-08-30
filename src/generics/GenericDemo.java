package generics;

class MyGeneric<T> {

    public T someValue;

    public MyGeneric(T someValue) {
        this.someValue = someValue;
    }

    public T getSomeValue() {
        return this.someValue;
    }
}

public class GenericDemo {

    public static void main(String[] args) {

        MyGeneric<Integer> integerMyGeneric = new MyGeneric<>(4);
        MyGeneric<String> stringMyGeneric = new MyGeneric<>("HertzBit");
    }
}
