package SDET_Java_Task;

public class Lab3_2 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int minValue = intArr[0];
        int maxValue = intArr[0];

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < minValue){
                minValue = intArr[i];
            };
            if (intArr[i] > maxValue){
                maxValue = intArr[i];
            }
        }

        System.out.println("Minimum: " + minValue);
        System.out.println("Maximum " + maxValue);
    }
}
