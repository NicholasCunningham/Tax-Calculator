// P4 Assignment
// Author: Nicholas Cunningham
// Date:   Jun 19, 2018
// Class:  CS163
// Email:  nic1571@cs.colostate.edu
import java.util.Scanner;

public class P4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		double grossSalary;
		double interestIncome;
		double capitalGains;
		int exemptions;
		double totalIncome;
		double adjustedIncome;
		double federalTax;
		double stateTax;
		
		System.out.print("Salary: ");
		grossSalary = keyboard.nextDouble();
		System.out.print("Exemptions: ");
		exemptions = keyboard.nextInt();
		System.out.print("Interest: ");
		interestIncome = keyboard.nextDouble();
		System.out.print("Gains: ");
		capitalGains = keyboard.nextDouble();
		
		totalIncome = grossSalary + interestIncome + capitalGains - 5000;
		
		if (exemptions > 6) exemptions = 6;
		
		adjustedIncome = totalIncome - (exemptions * 1500.00);
		
		// Federal tax calculation
		if (adjustedIncome >= 50000.0) {
			federalTax = (((adjustedIncome - 50000) * 0.28) + 1950.0 + 3450.0);
		} else if (adjustedIncome >= 35000.0) {
			federalTax = (((adjustedIncome - 35000) * 0.23) + 1950.0);
		} else if (adjustedIncome >= 20000.0) {
			federalTax = ((adjustedIncome - 20000) * 0.13);
		} else {
			federalTax = 0.0;
		}
		
		// State tax calculation
		stateTax = adjustedIncome * 0.065;

		// Printing results
		System.out.printf("Total Income: $%.2f\n", totalIncome);
		System.out.printf("Adjusted Income: $%.2f\n", adjustedIncome);
		System.out.printf("Total Tax: $%.2f\n", federalTax);
		System.out.printf("State Tax: $%.2f\n", stateTax);
		
		keyboard.close();
	}

}
