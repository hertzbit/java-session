package iohandling;

import java.util.Scanner;

public class StandardStreamTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive number");

        int num = sc.nextInt();

        if (num >= 0) {
            System.out.println("Great");
        } else {
            System.err.println("Number is negative");
        }
    }
}
