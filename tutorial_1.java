import java.util.*;

public class tutorial_1 {
    public static void main(String[] args){
        //Basics

        /* Q1: Print your name and age*/
        System.out.println("My name is Devinda rukshan jayasooriya");
        System.out.println("My age is 21");

        /* Q2: Write a program (use any name you like) and create a variable called runningTotal.
        Assign 0 to variable “runningTotal”.Then, add numbers 5, 8, 2, 3 (one at a time) to“runningTotal”
        variable.*/

        //Method 1
        int runningTotal = 0;
        runningTotal += 5;
        System.out.println("Current value is : "+runningTotal);
        runningTotal += 8;
        System.out.println("Current value is : "+runningTotal);
        runningTotal += 2;
        System.out.println("Current value is : "+runningTotal);
        runningTotal += 3;
        System.out.println("Current value is : "+runningTotal);

        //Method 2
        runningTotal = 0;
        int[] numbersToAdd = {5,8,2,3}; //this is an array

        //we can add numbers using for loop if you don't know what is for loop. we will learn it future.don't worry about that
        for(int num: numbersToAdd){
            runningTotal += num;
        }

        // final output
        System.out.println("final running total: "+runningTotal);

        System.out.println();

        /*Q3 : Write a program called “MarkAverage” that creates 3 variables
        which stores exam marks and calculates their mean (average) and outputs the result.
         */

        //Create variables
        int marksOne = 80;
        int marksTwo = 90;
        int marksThree = 100;

        //calculate the Average
        int markAverage = (marksOne + marksTwo + marksThree) / 3;
        System.out.println("Average Mark : "+markAverage);

        //Handling input and output

        /*Q4 : Modify your previous “Q1”.
         Program to ask the user to introduce a name (using the keyboard) and print “Hello” followed by the name inserted by the user.
         */

        Scanner input = new Scanner(System.in); //create input object. we will learn later about objects

        //prompt to the user
        System.out.println("Enter your name: ");
        String name = input.next(); //store name in the variable

        //output
        System.out.println("Hello " + name);
        System.out.println();

        /* Q5: Write a program in Java that prints the following menu in the console:
        *********
        *  MENU *
        *********
         */

        System.out.println("*********");
        System.out.println("* MENU  *");
        System.out.println("*********");

        /* Q6:  Write a program in Java that asks the user to insert a name and a surname and prints theinitials
         (first letter of the name + first letter of the surname). Example: John Brown shouldprint “JB)
         */

        //get inputs
        System.out.println("Enter your First name: ");
        String nameF = input.next();

        System.out.println("Enter your surname: ");
        String nameS = input.next();

        //Get the first letter
        String initials = nameF.substring(0,1) + nameS.substring(0,1);

        //output
        System.out.println("Initials: "+initials);

        /*Q7: Write a program that changes metres into centimetres.
        When the program is running, itshould allow you to enter the number in metres and
         then the program should print out thenumber in centimetres.
         */

        //inputs
        System.out.println("Enter length in meters: ");
        double meters = input.nextDouble();

        //process
        double MeterToCentimeter = meters*100;

        //output
        System.out.println(meters+" meters is equal to "+ MeterToCentimeter +"Centimeters");

        /*Write a program that will read in a Centigrade temperature and then display the Fahrenheit temperature
        using the formula.F = (9.0/5)*C + 32
         */
        //inputs
        System.out.println("Enter temerature in Centigrade :");
        double CentigradeTemp = input.nextDouble();

        //process
        double Fahrenheit = (9.0/5)*CentigradeTemp + 32;

        //output
        System.out.println(CentigradeTemp +" is equal to "+Fahrenheit);

        //End of Tutorial_1
    }
}