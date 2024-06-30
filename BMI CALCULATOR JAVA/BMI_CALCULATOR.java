import java.util.Scanner;

public class BMI_CALCULATOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;
        
        do {
            // Print
            System.out.print("    <WELCOME TO BMI CALCULATOR>");
            System.out.print("\n=================================");
            System.out.print("\n    THESE ARE THE BMI CATEGORIES:");
            System.out.print("\n\n  BMI\t\t\t CATEGORY");
            System.out.print("\nUnder 18\t\tUnderweight \n18.5\t\t        Normal Weight \n25 - 29.9\t\tOverweight \n30 or more\t\t Obesity");
            System.out.print("\n=================================");
            
            // Input
            System.out.print("\nPut your Weight in kilograms: ");
            double weight = scanner.nextDouble();
            System.out.print("Put your Height in centimeters: ");
            double height = scanner.nextDouble();
            
            // Computations
            double heightInMeters = height / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);
            String bmiFormatted = String.format("%.1f", bmi);
            System.out.println("Your BMI result: " + bmiFormatted);
            
            // If else
            if (bmi <= 18) {
                System.out.print("===You are Underweight===");
            } else if (bmi >= 18.5 && bmi <= 24.8) {
                System.out.print("===You are Normal Weight===");
            } else if (bmi >= 24.9 && bmi <= 29.9) {
                System.out.print("===You are Overweight===");
            } else if (bmi >= 30) {
                System.out.print("===You have Obesity===");
            }
            
            // Ask user if they want to calculate again
            System.out.print("\n\nWould you like to calculate another BMI? (yes/no): ");
            response = scanner.next();
            
        } while (response.equalsIgnoreCase("yes"));

        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||||||||||||||||Made by Kris Dane Madlambayan|||||||||||||||||||");
        System.out.println("||||||||||||||||||||||THANK YOU FOR TRUSTING||||||||||||||||||||||");
        System.out.println("||||||||||||||||||||||||OUR BMI CALCULATOR||||||||||||||||||||||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    }
}
