/**
 * Problem Set 2.
 *
 * Copyright (c) 2019. UCVTS and its affiliated.
 * Use is allowed as long as credit is given.
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

         final double INCHES_IN_MILE = 63360;
         final double INCHES_IN_YARD = 36;
         final double INCHES_IN_FOOT = 12;
         final double INCHES_IN_INCHES = 1;

         double milesRequired;
         double yardsRequired;
         double feetRequired;
         double inchesRequired;
         double inchesRemaining;

         System.out.print("\nEnter a number of inches : ");
         double inchesInput = in.nextDouble();

         double inchArray[] = makeChange(inchesInput,INCHES_IN_MILE);
         milesRequired = inchArray[0];
         inchesRemaining = inchArray[1];
         inchArray = makeChange(inchesRemaining,INCHES_IN_YARD);
         yardsRequired = inchArray[0];
         inchesRemaining = inchArray[1];
         inchArray = makeChange(inchesRemaining,INCHES_IN_FOOT);
         feetRequired = inchArray[0];
         inchesRemaining = inchArray[1];
         inchArray = makeChange(inchesRemaining,INCHES_IN_INCHES);
         inchesRequired = inchArray[0];
         inchesRemaining = inchArray[1];

         System.out.print("\nMILES  : " + String.format("%.0f",milesRequired) + "\nYARDS  : "
         + String.format("%.0f",yardsRequired) + "\nFEET   : " + String.format("%.0f",feetRequired)
          + "\nINCHES : " + String.format("%.0f",inchesRequired) + "\n");



        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

        final double CENTI_IN_KILO = 100000;
        final double CENTI_IN_METER = 1000;

        double kilosRequired;
        double metersRequired;
        double centiRemaining;

        System.out.print("\nEnter a number of centimeters : ");
        double centiInput = in.nextDouble();

        double centiArray[] = makeChange(centiInput,CENTI_IN_KILO);
        kilosRequired = centiArray[0];
        centiRemaining = centiArray[1];
        centiArray = makeChange(centiRemaining,CENTI_IN_METER);
        metersRequired = centiArray[0];
        centiRemaining = centiArray[1];

        System.out.print("\nKILOMETERS  : " + String.format("%.0f",kilosRequired) + "\nMETERS      : "
        + String.format("%.0f",metersRequired) + "\nCENTIMETERS : " + String.format("%.0f",centiRemaining) + "\n");


        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

         System.out.print("\nEnter a diameter: ");
         double diameterInput = in.nextDouble();
         double inputRadius = diameterInput/2;

         double circleArea = Math.PI * Math.pow(inputRadius,2);
         double circleCircumference = 2 * Math.PI * inputRadius;

         System.out.println("\nAREA          : " + String.format("%.2f",circleArea)
          + "\nCIRCUMFERENCE : " + String.format("%.2f",circleCircumference));

        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */

         System.out.print("\nEnter a length: ");
         double inputLength = in.nextDouble();
         System.out.print("Enter a width: ");
         double inputWidth = in.nextDouble();

         double inputArea = inputLength * inputWidth;
         double inputPerimeter = 2*(inputLength) + 2*(inputWidth);
         double inputDiagonal = Math.sqrt((Math.pow(inputLength,2)+Math.pow(inputWidth,2)));

         System.out.println("\nAREA      : " + String.format("%.2f",inputArea) + "\nPERIMETER : "
         + String.format("%.2f",inputPerimeter) + "\nDIAGONAL  : "
         + String.format("%.2f",inputDiagonal));

        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */

         System.out.print("\nEnter a side length: ");
         double inputSide = in.nextDouble();

         double inputHexArea = ((3 * Math.sqrt(3))/2) * Math.pow(inputSide,2);
         double inputHexPerimeter = inputSide * 6;

         System.out.println("\nAREA      : " + String.format("%.2f",inputHexArea)
         + "\nPERIMETER : " + String.format("%.2f",inputHexPerimeter));

        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */

         System.out.print("\nEnter a String: ");
         String inputString = in.next();

         int stringLength = inputString.length();
         int halfWay = (int) Math.floor(stringLength/2);

         String firstHalf = inputString.substring(0,halfWay);
         String secondHalf = inputString.substring(halfWay,stringLength);

         System.out.println("\n" + secondHalf + firstHalf);

        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */

         System.out.print("\nEnter your first name: ");
         String inputFirstName = in.next();
         System.out.print("Enter your middle name: ");
         String inputMiddleName = in.next();
         System.out.print("Enter your last name:  ");
         String inputLastName = in.next();

         System.out.print("\n" + inputFirstName.substring(0,1) + inputMiddleName.substring(0,1)
         + inputLastName.substring(0,1) + "\n");


        in.close();
    }
    public static double[] makeChange(double startAmount, double changeAmount){
      double amountCurrentDenomination = Math.floor(startAmount/changeAmount);
      // System.out.println(amountCurrentDenomination);
      double returnAmount = startAmount % changeAmount;
      // System.out.println(returnAmount);
      double[] returnArray = {amountCurrentDenomination,returnAmount};
      return returnArray;
    }
}
