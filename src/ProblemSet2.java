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
        System.out.print("\nHOMETOWN : " + homeTown);

        // in.close();

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

         System.out.print("\nEnter a dollar amount: ");
         double moneyImput = in.nextDouble();

         double dollars = (moneyImput - (moneyImput%1))/1;
         moneyImput = (moneyImput - Math.floor(moneyImput/1));
         double quarters = (moneyImput -(moneyImput%0.25))/0.25;
         moneyImput = (moneyImput - Math.floor(moneyImput*0.25));
         double dimes = (moneyImput - (moneyImput%0.1))/0.1;
         moneyImput = (moneyImput - Math.floor(moneyImput*0.1));
         double nickles = (moneyImput - (moneyImput%0.05))/0.05;
         moneyImput = (moneyImput - Math.floor(moneyImput*0.05));
         double pennies = (moneyImput - (moneyImput%0.01))/0.01;
         moneyImput = (moneyImput - Math.floor(moneyImput*0.01));
         System.out.println(dollars);
         System.out.println(quarters);
         System.out.println(dimes);
         System.out.println(nickles);
         System.out.println(pennies);


        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */



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
}
