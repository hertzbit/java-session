import java.util.Scanner;

public class DataTypeDemo {

    public static void main(String[] args) {

        //Primitive
        byte myByte = 127;  //Byte
        short myShort = 32765; //Short
        int myInt = 65550; //Integer
        Integer someAnotherInteger  = new Integer(2);
        Integer someInteger = Integer.valueOf(1);
        long myLong = 1; //Long
        boolean isConditionTrue = false; //Boolean
        float myFloat = 3.14f; //Float
        double myDouble = 3.14; //Double
        char myChar = 'C'; //Character

        //System.out.println(isConditionTrue);
        Scanner scanner = new Scanner(System.in);
        int enteredInteger = scanner.nextInt();
        System.out.println("Entered Value : " + enteredInteger);
    }
}
