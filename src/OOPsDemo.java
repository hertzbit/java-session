public class OOPsDemo {

    //Method Overloading / Function Overloading
    public static int addNumbers(int numOne, int numTwo) {

        int sumOfTwoNumbers = numOne + numTwo;
        return sumOfTwoNumbers;
    }

    public static double addNumbers(double numOne, double numTwo) {

        double sumOfTwoNumbers = numOne + numTwo;
        return sumOfTwoNumbers;
    }

    public static int addNumbers(int numOne, int numTwo, int numThree) {

        int sumOfThreeNumbers = numOne + numTwo + numThree;
        return sumOfThreeNumbers;
    }

    public static void main(String[] args) {

        int sumOfTwoNumbers = addNumbers(1, 2);
        int sumOfThreeNumbers = addNumbers(1, 2, 3);
        System.out.println(sumOfTwoNumbers);
        System.out.println(sumOfThreeNumbers);
    }
}
