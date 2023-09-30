package Java_Lab03;

import java.util.Scanner;

public class Lab3_3 {
    public static void main(String[] args) {

        int[] inputArray = new int[5];
        System.out.println("Nhap vao 5 phan tu cua mang: ");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = scanner.nextInt();
        }

        for (int i = 0; i < inputArray.length - 1 ; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] > inputArray[j]) {
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
            }
        }
        System.out.print("Sorted array: ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
    }
}
