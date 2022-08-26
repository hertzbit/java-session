import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

    static int someFunction (int number) {
        return number - someFunction(number - 1);
    }

    public static void readFromFile (File file) {

        try {
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void readFromFileAnotherWay (File file) throws FileNotFoundException{

        FileInputStream fis = new FileInputStream(file);

    }
    public static void main(String[] args) {

//        readFromFile(new File(""));
//        try {
//            readFromFileAnotherWay(new File(""));
//        } catch (FileNotFoundException exception) {
//            exception.printStackTrace();
//        }

        int numOne = 5;
        int numTwo = 1;

        try {
            int value = numOne / numTwo;
            someFunction(Integer.MAX_VALUE);
        } catch (Exception exception) {
            System.out.println("User has entered 0 as divisor");
        } finally {
            System.out.println("Finally Block");
        }

        System.out.println("End of Program");

    }
}
