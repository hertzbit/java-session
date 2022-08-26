public class ArraysDemo {

    public static void main(String[] args) {

        int myArray[] = new int[5];

        int startingNumber = 100;
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = startingNumber + i;
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}
