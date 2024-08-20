
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
    int hasWorked = 0;
    int overtimeHours = 0;
    int payRate = 0;
    double normalPay = 0.0;
    double overtimePay = 0.0;
    double payCheck = 0.0;

    // getting users name, hours, and payrate

        System.out.println("Enter name: ");
        name = scanner.nextLine();

        System.out.println("Enter hours worked: ");
        hasWorked = scanner.nextInt();

        System.out.println("Enter pay rate: ");
        payRate = scanner.nextInt();



        overtimeHours = hasWorked - 40;
        normalPay = hasWorked * payRate;
        payCheck = normalPay + overtimePay;

        if (hasWorked > 40) {
            overtimePay = overtimeHours * payRate * 1.5;
        }

        System.out.println(overtimeHours);
        System.out.println(payCheck);





        // test for inputs
       //System.out.println("Name: " + name + "\nHours: " + hasWorked + " \nPayrate: " + payRate);

    }
}