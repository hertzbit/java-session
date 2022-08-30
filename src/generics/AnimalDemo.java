package generics;

class Animal {

    public void whoAmI() {
        System.out.println("I am an Animal");
    }
}

class Dog extends Animal {

    @Override
    public void whoAmI() {
        System.out.println("I am a Dog");
    }

    public void bark() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {

    @Override
    public void whoAmI() {
        System.out.println("I am a Cat");
    }

    public void meow() {
        System.out.println("Meow");
    }
}

public class AnimalDemo {

    public static void doBark(Animal animal) {
        Dog dog = (Dog) animal;
        dog.bark();
    }

    public static void main(String[] args) {

        Animal cat = new Cat();
        doBark(cat);
    }
}
