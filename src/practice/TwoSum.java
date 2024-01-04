package practice;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int indexOfArr1 = 0;
        int indexOfArr2 = 0;
        int indexOfMyArr = 0;
        List<Integer> myArray = new ArrayList<>();
        int[] arr1 = {1, 3, 5, 6, 9};
        int[] arr2 = {1, 2, 3, 5, 7, 9};

        while (indexOfArr1 < arr1.length && indexOfArr2 < arr2.length) {
            if (arr1[indexOfArr1] < arr2[indexOfArr2]) {
                myArray.add(arr1[indexOfArr1]);
                indexOfArr1++;
            } else {
                myArray.add(arr2[indexOfArr2]);
                indexOfArr2++;
            }
            indexOfMyArr++;
        }

        if (indexOfArr1 == arr1.length) {
            while (indexOfArr2 < arr2.length) {
                myArray.add(arr2[indexOfArr2]);
                indexOfArr2++;
                indexOfMyArr++;
            }
        }
        if (indexOfArr2 == arr2.length) {
            while (indexOfArr1 < arr1.length) {
                myArray.add(arr1[indexOfArr1]);
                indexOfArr1++;
                indexOfMyArr++;
            }
        }


        for (int value : myArray) {
            System.out.print(value);
        }
    }
}
