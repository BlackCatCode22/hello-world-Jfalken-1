
/*
 * Jacob Falken
 * 8/20/2024
 * Payroll.java
 */



import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // values for names, hours, and payrate
        String name = "";
        int hoursWorked = 0;
        int overtimeHours = 0;
        double payRate = 0.0;
        double normalPay = 0.0;
        double overtimePay = 0.0;
        double payCheck = 0.0;

        // getting users name, hours, and payrate

        System.out.println("Enter name: ");
        name = scanner.nextLine();

        System.out.println("Enter hours worked: ");
        hoursWorked = scanner.nextInt();

        System.out.println("Enter pay rate: ");
        payRate = scanner.nextDouble();


        if (hoursWorked > 40) {
            overtimeHours = hoursWorked - 40;
            overtimePay = overtimeHours * payRate * 1.5;
            normalPay = 40 * payRate;
            payCheck = normalPay + overtimePay;
        } else {
            payCheck = hoursWorked * payRate;
        }


        System.out.println("Hello, " + name + "\nYour paycheck is: $" + payCheck);






        // test for inputs
        //System.out.println("Name: " + name + "\nHours: " + hasWorked + " \nPayrate: " + payRate);

    }
}
