package java_lab04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.security.SecureRandom;

public class Lab4 {
    static int ARRAY_LENGTH = 5;
    static int MAX_VALUE = 1000;

    public static void main(String[] args) {
        List<Integer> myArray = generateRandomArray();
        printGameMenu();
        Scanner scanner = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Please choose an option in GAME MENU");
            int userOption = scanner.nextInt();
            switch (userOption) {
                case 1:
                    printAllValue(myArray);
                    break;
                case 2:
                    printMaxValue(myArray);
                    break;
                case 3:
                    printMinValue(myArray);
                    break;
                case 4:
                    searchNum(myArray);
                    break;
                case 5:
                    isContinue = false;
                    System.out.println("End Game!");
                    break;
                default:
                    System.out.println("PLease enter a number in Menu!");
            }
        }
    }

    private static void printGameMenu() {
        System.out.println("==== GAME MENU ====");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.println("5. Exit");
    }

    private static List<Integer> generateRandomArray() {
        List<Integer> randomArray = new ArrayList<>();
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            randomArray.add(new SecureRandom().nextInt(MAX_VALUE));
        }
        return randomArray;
    }

    private static void printAllValue(List<Integer> arrayList) {
        System.out.print("Your array is: ");
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();
    }

    private static void printMaxValue(List<Integer> arrayList) {
        int maxValue = arrayList.get(0);
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (maxValue < arrayList.get(i)) {
                maxValue = arrayList.get(i);
            }
        }
        System.out.println("The max value is: " + maxValue);
    }

    private static void printMinValue(List<Integer> arrayList) {
        int minValue = arrayList.get(0);
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (minValue > arrayList.get(i)) {
                minValue = arrayList.get(i);
            }
        }
        System.out.println("The min value is: " + minValue);
    }

    private static void searchNum(List<Integer> arrayList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number you want to search");
        int inputNum = scanner.nextInt();
        int indexOfNum = -1;
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (inputNum == arrayList.get(i)) {
                indexOfNum = i;
            }
        }
        if(indexOfNum >= 0){
            System.out.println("Index of your number is: " + indexOfNum);
        }else {
            System.out.println("Your number is not in the list");
        }
    }
}
