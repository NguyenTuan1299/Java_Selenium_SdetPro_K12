package java_lab06;

public class Lab6_3 {
    public static void main(String[] args) {
        String myStr = "100 minutes 329765489abc";
        extractDigit(myStr);
    }

    private static void extractDigit(String myStr) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < myStr.length(); i++) {
            char currentChar = myStr.charAt(i);
            if (Character.isDigit(currentChar)) {
                newStr.append(currentChar);
            }
        }
        System.out.println("The output is: " + newStr.toString());
    }
}
