package java_lab06;

import java.util.Scanner;

public class Lab6_2 {

    static final int MAX_INPUT_TIME = 3;

    public static void main(String[] args) {
        String myPassword = "password123";
        checkInputPassword(myPassword);
    }

    private static void checkInputPassword(String myPassword) {
        int inputTime = 0;
        Scanner scanner = new Scanner(System.in);
        while (inputTime < MAX_INPUT_TIME) {
            System.out.println("Please enter your password:");
            String inputPassword = scanner.nextLine();
            if (myPassword.equals(inputPassword)) {
                System.out.println("Your password is correct!");
                inputTime = MAX_INPUT_TIME + 1;
            } else {
                System.out.println("Your password is incorrect!");
                inputTime++;
            }
        }
        if(inputTime == MAX_INPUT_TIME){
            System.out.println("Maximum number of attempts reached!");
        }
        scanner.close();
    }
}
