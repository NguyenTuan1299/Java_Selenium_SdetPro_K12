//package practice;
//
//import java.security.SecureRandom;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class test1 {
//    static final int MAX_LENGTH = 10;
//    public static void main(String[] args) {
//        List<Integer> myArr = generateRandomArray();
//        printMenuGame();
//        boolean isContinue = true;
//        while (isContinue){
//            System.out.println("Please choose an option in GAME MENU");
//            Scanner scanner = new Scanner(System.in);
//            int userOption = scanner.nextInt();1
//            switch (userOption){
//                case 1:
//                    printAllValue(myArr);
//                    break;
//                case 2:
//                    findMaxValue(myArr);
//                    break;
//                case 3:
//                    findMinValue(myArr);
//                    break;
//                case 4:
//                    searchNumber(myArr);
//                    break;
//                case 5:
//                    isContinue = false;
//                    System.out.println("End Game!");
//                    break;
//                default:
//                    System.out.println("PLease enter a number in Menu!");
//            }
//        }
//    }
//
//    public static void printMenuGame (){
//        System.out.println("==== GAME MENU ====");
//        System.out.println("1. Print all numbers");
//        System.out.println("2. Print maximum value");
//        System.out.println("3. Print minimum value");
//        System.out.println("4. Search number");
//        System.out.println("5. Exit");
//    }
//
//    public static List<Integer> generateRandomArray(){
//        List<Integer> myArr = new ArrayList<>();
//        for (int i = 0; i < MAX_LENGTH; i++) {
//            myArr.add(new SecureRandom().nextInt(100));
//        }
//        return myArr;
//    }
//
//    private static void printAllValue(List<Integer> arrayList) {
//        System.out.println("Your array is: ");
//        for (int value : arrayList) {
//            System.out.println(value);
//        }
//    }
//
//    public static int findMinValue(List<Integer> myArr){
//        int minValue = 0;
//        for (int i :
//                myArr) {
//            if(minValue > i){
//                minValue = i;
//            }
//        }
//        return minValue;
//    }
//
//    public static int findMaxValue(List<Integer> myArr){
//        int maxValue = 0;
//        for (int i :
//                myArr) {
//            if(maxValue < i){
//                maxValue = i;
//            }
//        }
//        return maxValue;
//    }
//
//    public static void searchNumber(List<Integer> myArr){
//        Scanner scanner = new Scanner(System.in);
//        int inputNum = scanner.nextInt();
//        if(myArr.indexOf(inputNum) > 0){
//            System.out.println("Index of your number is: " + myArr.indexOf(inputNum));
//        }else {
//            System.out.println("Your number is not in the list");
//        }
//    }
//
//}
