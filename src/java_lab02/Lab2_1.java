package java_lab02;

public class Lab2_1 {
    public static void main(String[] args) {
        double userHeight = 1.8;
        double userWeight = 73;

        double userBMI = userWeight / (userHeight * 2);

        System.out.println("Your BMI is: " + userBMI);

        if (userBMI <= 18.5) {
            System.out.println("You are Underweight");
        } else if (userBMI < 24.9) {
            System.out.println("You are Normal weight");
        } else if (userBMI < 29.9) {
            System.out.println("You are Overweight");
        } else {
            System.out.println("You are Obesity");
        }

    }
}
