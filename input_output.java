/**
* This class implements a simple program that will compute
* the amount of interest that is earned on an investment over
* a period of one year. The initial amount of the investment
* and the interest rate are input by the user. The value of
* the investment at the end of the year is output. The
* rate must be input as a decimal, not a percentage (for
* example, 0.05 rather than 5).
*/

import java.util.Scanner;  
public class input_output
   {
    public static void main(String[] args)
      {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        double principal;
        double rate;
        double interest;

        System.out.println("Enter the initial investment: ");
        principal = input.nextDouble();
        System.out.println("Enter the annual interest rate (decimal, not percentage!): ");
        rate = input.nextDouble();
        interest = principal * rate;
        principal = principal + interest;
        System.out.println("The value of the investment after one year is $"+principal);
} 
}
