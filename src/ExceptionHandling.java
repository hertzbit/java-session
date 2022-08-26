import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

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
        int numTwo = 0;

        try {
            int value = numOne / numTwo;
        } catch (ArithmeticException exception) {
            System.out.println("User has entered 0 as divisor");
        } finally {
            System.out.println("Closing used resources");
        }

        System.out.println("End of Program");

    }
}
