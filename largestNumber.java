import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declare variables to store the three numbers and the largest number
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largestNum = 0;

        // Prompt the user to input three numbers
        System.out.println("Enter first number: ");
        num1 = scanner.nextInt();

        System.out.println("Enter second number: ");
        num2 = scanner.nextInt();

        System.out.println("Enter third number: ");
        num3 = scanner.nextInt();

        // Processing
        // Nested if statements to determine largest number
        if (num1 > num2) {
            if (num1 > num3) {
                largestNum = num1;
            } else {
                largestNum = num3;
            }
        } else {
            if (num2 > num3) {
                largestNum = num2;
            } else {
                largestNum = num3;
            }
        }


        System.out.println("The largest number is: " + largestNum);
    }
}