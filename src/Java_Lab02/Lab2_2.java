package Java_Lab02;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number: ");
        int userNum = scanner.nextInt();

        if (userNum % 2 == 1) {
            System.out.println("It's an odd number");
        } else {
            System.out.println("It's an even number");
        }
    }
}
