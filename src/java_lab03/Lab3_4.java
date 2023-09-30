package java_lab03;

import java.util.Scanner;

public class Lab3_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] newInputArray1 = new int[5];
        int[] newInputArray2 = new int[5];

        // User input array
        System.out.println("Input 5 values of the first array: ");
        for (int i = 0; i < newInputArray1.length; i++) {
            newInputArray1[i] = scanner.nextInt();
        }
        System.out.println("Input 5 values of the second array: ");
        for (int i = 0; i < newInputArray1.length; i++) {
            newInputArray2[i] = scanner.nextInt();
        }

        // Merge 2 arrays
        int indexOfMergeArray = 0;
        int[] mergeArray = new int[newInputArray1.length + newInputArray2.length];
        for (int i = 0; i < (mergeArray.length - newInputArray1.length); i++) {
            mergeArray[indexOfMergeArray] = newInputArray1[i];
            indexOfMergeArray++;
        }
        for (int i = 0; i < mergeArray.length - newInputArray2.length; i++) {
            mergeArray[indexOfMergeArray] = newInputArray2[i];
            indexOfMergeArray++;
        }
        // Print merge array
        System.out.print("The new array after merge 2 inputted arrays: ");
        for (int i = 0; i < mergeArray.length; i++) {
            System.out.print(mergeArray[i] + " ");
        }
        System.out.println();

        // Sort merge array
        for (int i = 0; i < mergeArray.length - 1; i++) {
            for (int j = i + 1; j < mergeArray.length; j++) {
                if (mergeArray[i] > mergeArray[j]) {
                    int temp = mergeArray[i];
                    mergeArray[i] = mergeArray[j];
                    mergeArray[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("The new array after sorting: ");
        for (int i = 0; i < mergeArray.length; i++) {
            System.out.print(mergeArray[i] + " ");
        }

    }
}
