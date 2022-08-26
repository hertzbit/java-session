class Student {

    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void calculateGrade(int marks) {

    }
}

public class AbstractionAndEncapsulationDemo {

    public static void main(String[] args) {

        Student studentOne = new Student(1, "John Doe");
        studentOne.setName("Chetan");
    }
}
