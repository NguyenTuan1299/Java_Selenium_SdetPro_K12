package java_lab06;

public class Lab6_1 {
    public static void main(String[] args) {
        String inputString = "10hrs and 05 minutes";
        int totalMinutes = CalculateTotalMinutes(inputString);
        System.out.println("Total of minutes is: " + totalMinutes);
    }
    private static int CalculateTotalMinutes(String inputString) {
        String inputHrs = inputString.substring(0, inputString.indexOf("hrs"));
        String inputMinutes = inputString.substring(inputString.indexOf("and") + 4, inputString.indexOf("minutes") - 1);
        int numOfHrs = Integer.parseInt(inputHrs);
        int numOfMinutes = Integer.parseInt(inputMinutes);
        int totalMinutes = numOfHrs * 60 + numOfMinutes;
        return totalMinutes;
    }
}
