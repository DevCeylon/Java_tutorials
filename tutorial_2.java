import java.util.Scanner;
public class tutorial_2 {
    public static void main(String[] args){

        /*Q1: Write a program in Java that reads 2 numbers (double) and prints the sum of the 2 numbers.
Notes:
• To read an input you will have to import Scanner first: import java.util.Scanner
• Use input.nextDouble()to read the input from the user (the two numbers)
• Remember that variables have a data type.*/

        Scanner input = new Scanner(System.in); //Create a Scanner
        //inputs
        System.out.println("Enter number one: ");
        double numberOne = input.nextDouble();
        System.out.println("Enter number two: ");
        double numberTwo = input.nextDouble();
        //process
        double sumOfNumbers = numberOne + numberTwo;
        //output
        System.out.println("Sum of the numbers are equals: "+sumOfNumbers);

        /* Q2: Write a program in Java that asks the user to input a number. If the number entered is equal or
           larger than 18, the program should display “Over 18”. If the number entered is lower than 18, the
           program should display “Under 18”. If the number entered is lower than 0, the program should
           display an error message “The age entered is incorrect.”. Try different inputs such as: -1, 0, 10, 18,
           20.*/

        //inputs
        System.out.println("Input a number: ");
        double number = input.nextDouble();

        //check the conditions
        if(number >= 18) {
            System.out.println("over 18 ");
        } else if (number <= 18 && number >0 ) {
            System.out.println("Under 18 ");
        } else{
            System.out.println("error! ");
        }

        /* Q3: Write a program to read in a temperature value, and if the temperature is above a certain
value display ‘Hot’, otherwise display ‘Cold’.
         */
        //inputs
        System.out.println("Enter the temperature value: ");
        double temp = input.nextDouble();
        //process
        if(temp > 100) {
            System.out.println("Hot ");
        } else{                                //outputs
            System.out.println("Cold ");
        }

        /* Q4: A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask the user to enter marks and print the corresponding grade.
*/
        //inputs
        System.out.println("input marks: ");
        double marks = input.nextDouble();

        //check the conditions
        if(marks >= 80) {
            System.out.println("A");
        } else if (marks >= 60) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C");
        } else if (marks >= 45) {
            System.out.println("D");
        } else if (marks >= 25) {
            System.out.println("E");
        } else{
            System.out.println("F");
        }

        //method 2:
        System.out.print("Enter your marks_2: ");
        double marks_2 = input.nextDouble();

        char grade;

        if (marks_2 < 25) {
            grade = 'F';
        } else if (marks_2 >= 25 && marks_2 < 45) {
            grade = 'E';
        } else if (marks_2 >= 45 && marks_2 < 50) {
            grade = 'D';
        } else if (marks_2 >= 50 && marks_2 < 60) {
            grade = 'C';
        } else if (marks_2 >= 60 && marks_2 <= 80) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("Your grade: " + grade);

        /* Q5: Use switch-case construct to calculate number of days in a month when you give month as
the input. You are only allowed to call the switch only once for the whole calculation.
January - 31 days
February - 28 days in a common year and 29 days in leap years
March - 31 days
April - 30 days
May - 31 days
June - 30 days
July - 31 days
August - 31 days
September - 30 days
October - 31 days
November - 30 days
December - 31 days*/
        //input
        System.out.println("Enter month: ");
        String month = input.next().toLowerCase();

        switch (month) {

            case "january":
                System.out.println("31 days ");
                break;
            case "february":
                System.out.println("28 days");
                break;
            case "march":
                System.out.println("31 days");
                break;
            case "april":
                System.out.println("30 days");
                break;
            case "may":
                System.out.println("31 days");
                break;
            case "june":
                System.out.println("30 days");
                break;
            case "july":
                System.out.println("31 days");
                break;
            case "august":
                System.out.println("31 days");
                break;
            case "september":
                System.out.println("30 days");
                break;
            case "october":
                System.out.println("31 days");
                break;
            case "november":
                System.out.println("30 days");
                break;
            case "december":
                System.out.println("31 days");
                break;
            default:
                System.out.println("please enter a valid month...");
        }

        //method 2
        System.out.print("Enter the month (1-12): ");
        int month2 = input.nextInt();

        int days;

        switch (month2) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                break;
            case 2: // February
                days = 28;
                break;
            default:
                System.out.println("Invalid month input ");
                return;
        }

        System.out.println("Number of days in the month: " + days);

        System.out.println();

        /* Q6: Write a program to check whether an entered character is lowercase ( a to z ) or uppercase
( A to Z ).*/

        //inputs
        System.out.println("Enter a character: ");
        char cha = input.next().charAt(0);

        //check
        if(cha >= 'a' && cha <= 'z') {
            System.out.println("lowercase");
        } else if (cha >= 'A' && cha <= 'Z') {
            System.out.println("uppercase");
        } else{
            System.out.println("invalid input ");
        }

       // end of the tutorial 2



    }
}