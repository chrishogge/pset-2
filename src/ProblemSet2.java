/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

        System.out.print("\nEnter your first name: ");
        String firstName = in.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = in.nextLine();
        System.out.print("Enter your grade: ");
        String grade = in.nextLine();
        System.out.print("Enter your age: ");
        String age = in.nextLine();
        System.out.print("Enter your hometown: ");
        String homeTown = in.nextLine();

        System.out.print("\nNAME\t : " + firstName + " " + lastName);
        System.out.print("\nGRADE\t : " + grade);
        System.out.print("\nAGE\t : " + age);
        System.out.print("\nHOMETOWN : " + homeTown + '\n');

        /*
         * Exercise 2.
         *
         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

         final double DOLLAR = 100;
         final double QUARTER = 25;
         final double DIME = 10;
         final double NICKEL = 5;
         final double PENNY = 1;
         double dollarsRequired;
         double quartersRequired;
         double dimesRequired;
         double nickelsRequired;
         double penniesRequired;
         double changeRemaining;

         System.out.print("\nEnter a dollar amount: ");
         double moneyImput = (in.nextDouble())*100;

         double[] changeArray = makeChange(moneyImput,DOLLAR);
         dollarsRequired = changeArray[0];
         changeRemaining = changeArray[1];
         changeArray = makeChange(changeRemaining,QUARTER);
         quartersRequired = changeArray[0];
         changeRemaining = changeArray[1];
         changeArray = makeChange(changeRemaining,DIME);
         dimesRequired = changeArray[0];
         changeRemaining = changeArray[1];
         changeArray = makeChange(changeRemaining,NICKEL);
         nickelsRequired = changeArray[0];
         changeRemaining = changeArray[1];
         changeArray = makeChange(changeRemaining,PENNY);
         penniesRequired = changeArray[0];
         changeRemaining = changeArray[1];

        System.out.print("\nDOLLARS  : " + String.format("%.0f",dollarsRequired) + "\nQUARTERS : "
        + String.format("%.0f",quartersRequired) + "\nDIMES    : " + String.format("%.0f",dimesRequired)
         + "\nNICKLES  : " + String.format("%.0f",nickelsRequired) + "\nPENNIES  : "
         + String.format("%.0f",penniesRequired) + "\n");

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

         final double TEN_DOLLAR = 1000;
         final double FIVE_DOLLAR = 500;
         double tensRequired;
         double fivesRequired;

         System.out.print("\nEnter a dollar amount : ");
         moneyImput = (in.nextDouble())*100;

         changeArray = makeChange(moneyImput,TEN_DOLLAR);
         tensRequired = changeArray[0];
         changeRemaining = changeArray[1];
         changeArray = makeChange(changeRemaining,FIVE_DOLLAR);
         fivesRequired = changeArray[0];
         changeRemaining = changeArray[1];
         changeArray = makeChange(changeRemaining,DOLLAR);
         dollarsRequired = changeArray[0];
         changeRemaining = changeArray[1];
         changeArray = makeChange(changeRemaining,QUARTER);
         quartersRequired = changeArray[0];
         changeRemaining = changeArray[1];
         changeArray = makeChange(changeRemaining,DIME);
         dimesRequired = changeArray[0];
         changeRemaining = changeArray[1];
         changeArray = makeChange(changeRemaining,NICKEL);
         nickelsRequired = changeArray[0];
         changeRemaining = changeArray[1];
         changeArray = makeChange(changeRemaining,PENNY);
         penniesRequired = changeArray[0];
         changeRemaining = changeArray[1];

         double billsRequired = tensRequired + fivesRequired + dollarsRequired;
         double coinsRequired = quartersRequired + dimesRequired + nickelsRequired + penniesRequired;
         System.out.print("\nBILLS : " + String.format("%.0f",billsRequired) +
          "\nCOINS : " + String.format("%.0f",coinsRequired) +"\n");


        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */



        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */



        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */



        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */



        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */



        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */



        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */



        in.close();
    }
    public static double[] makeChange(double startAmount, double changeAmount){
      double amountCurrentDenomination = Math.floor(startAmount/changeAmount);
      double returnAmount = startAmount % changeAmount;
      double[] returnArray = {amountCurrentDenomination,returnAmount};
      return returnArray;
    }
}
