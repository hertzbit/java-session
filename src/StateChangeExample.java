class SomeClass {

    private String name;

    @Override
    public String toString() {
        return "SomeClass{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty() || !name.trim().isBlank())
            this.name = name;
        else
            System.out.println("Name cannot be blank or empty");
    }
}

public class StateChangeExample {

    public static void main(String[] args) {
        SomeClass someObjectOne = new SomeClass();
        SomeClass someObjectTwo = new SomeClass();
        SomeClass someObjectThree = new SomeClass();

        someObjectOne.setName("Chetan");
        System.out.println(someObjectOne);
        someObjectTwo.setName(" ");
        System.out.println(someObjectTwo);
//        someObjectThree.name = "";
//        System.out.println(someObjectThree);
    }

}
