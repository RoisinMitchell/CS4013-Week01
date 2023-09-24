//Roisin Mitchell
//21193762

import java.util.*;
public class Exercise2_25{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter employee's name: ");
        String name = userInput.next();


        System.out.println("Enter number of hours worked in a week: ");
        double hoursWorked = userInput.nextDouble();

        System.out.println("Enter hourly pay rate: ");
        double hourlyPay = userInput.nextDouble();

        System.out.println("Enter federal tax withholding rate: ");
        double federalTax = userInput.nextDouble();

        System.out.println("Enter state tax withholding rate: ");
        double stateTax = userInput.nextDouble();


        double grossPay = hoursWorked * hourlyPay;
        double federalDeduction = grossPay * federalTax ;
        double stateDeduction = grossPay * stateTax;
        double totalDeduction = federalDeduction + stateDeduction;
        double netPay = grossPay - totalDeduction;

        System.out.println("\nEmployee Name: " + name + "\nHours Worked: " + hoursWorked + "\nPay Rate: $"
                + hourlyPay + "\nGross Pay: $"+ grossPay +  "\n\nDeductions:\n   Federal Withholding: $"
                + federalDeduction + "\n   State withholding: $" + stateDeduction + "\n   Total Deduction: &"
                + totalDeduction + "\nNet Pay: $" + netPay);
    }
}