public class Calculator {

    public static void main(String[] args) {


        int numOne = 2;
        int numTwo = 3;

        String action = "mul";

        switch(action) {
            case "add" :
                System.out.println(numOne + numTwo);
                break;
            case "sub" :
                System.out.println(numOne - numTwo);
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }
}
