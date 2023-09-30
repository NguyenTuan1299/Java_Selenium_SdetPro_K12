package java_lab03;

public class Lab3_1 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                evenCount++;
            } else if (intArr[i] % 2 == 1) {
                oddCount++;
            }

        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd number: " + oddCount);
    }
}
