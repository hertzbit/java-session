import java.util.Scanner;

public class ConditionalDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age : ");
        int enteredAge = scanner.nextInt();

        if (enteredAge >= 18) {
            System.out.println("You can vote !");
        } else {
            System.out.println("You cannot vote");
        }
    }
}
