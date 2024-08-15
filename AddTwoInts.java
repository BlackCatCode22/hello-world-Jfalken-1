/*
 * Jacob Falken
 * 8/15/2024
 * AddTwoInts.java
 */

import java.util.Scanner;


public class AddTwoInts {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to the double int program! \n\n");

        int firstNum = 0;
        int secondNum = 0;
        int sumOfBothNumbers = 0;

        //Create Scanner Object
        Scanner myScannerObject = new Scanner(System.in);

        // Ask user for the first int
        System.out.println("\n\n Please enter a whole number: ");
        firstNum = myScannerObject.nextInt();

        //Input test
        System.out.println("The value of firstNum is: " + firstNum);

        // Ask user for the second int
        System.out.println("\n\n Please enter a another whole number: ");
        secondNum = myScannerObject.nextInt();

        //Intput test for second num
        System.out.println("The value of secondNum is: " + secondNum);

        //processing
        //add the two ints
        //the total of firstNum and secondNum will be stored in the variable named: sumOfBothNumbers

        sumOfBothNumbers = firstNum + secondNum;

        // Output the value of the variable named: sumOfBothNumbers
        System.out.println("\n The value of sumOfBothNumbers is " + sumOfBothNumbers);

    }
}