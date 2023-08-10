import java.util.Scanner;
import java.util.Random;
public class tutorial_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        /* Q1:Write a program that uses a loop to print the following:
        1
        2
        3
        4
        5*/
        for(int i=1 ; i<=5 ; i++){
            System.out.println(i);
        }
        System.out.println();

        /* Q2:Extend the previous program (exercise 3) to print the following using two loops (nested loop):
        1
        22
        333
        4444
        55555
        Hint: You can use System.out.print("\n") to print a new line.
         */
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=i ; j++ ){
                System.out.print(i); //use print
            }
            System.out.println();
        }
        System.out.println();

        /*Q3: Modify again the previous program (exercise 2) to print the following output:
        22
        4444
        666666
        88888888
         */
        for(int i=2 ; i<=8 ; i=i+2){
            for(int j=1 ; j<=i ; j++ ){
                System.out.print(i); //use print
            }
            System.out.println();
        }
        System.out.println();

        /*Q4: Write a java program using a while loop to accept an positive integer n and a letter from
        the user to print the letter n times.
        Enter a number : 5
        Enter a letter : Y
        output : YYYYY
         */
        //inputs
        System.out.println("Enter a Number: ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("please enter a positive integer...");
        } else{
            System.out.println("Enter a letter");
            char letter = input.next().charAt(0);

            int count = 0;
            while (count < number){
                System.out.print(letter);
                count++;
            }
        }

        System.out.println();
        System.out.println();

        /*Q5: Write a program that uses do-while loop to print the sum of
        squares of integers from 1 to 10.
         */
        //initialize variables
        int num = 1;
        int sum = 0;
        do{
            int square = num*num;
            sum += square;
            num++;
        } while(num <= 10);

        //output
        System.out.println("The sum of squares is: " + sum);

        /*Q6: Write a program that checks if a passcode is correct. The user has 4 attempts to input the
        passcode correctly. The passcode is 486251. To read an int, you can use input.nextInt().
        If the user enters the passcode correctly should display a message saying “Correct passcode” and
        the program should end.Note: Think about which control structure you will use to allow
        the user inserting a maximum of 4passcodes. Do not repeat your code 4 times. Will you use an if,
        a for loop, a while loop, a switch?Think about the most adequate control structure.
         */

        //using for loop
        for (int i = 0 ; i < 4 ; i++){
            System.out.println("Enter passcode: ");
            int passcode = input.nextInt();

            if (passcode == 486251 ){
                System.out.println("correct passcode...");
                break;
            }else{
                System.out.println("Try again...");
            }
        }
        System.out.println();

        //Method 2 - Using while loop
        int attempts = 4;

        while(attempts > 0){
            System.out.println("Enter passcode: ");
            int passcodeW = input.nextInt();

            if(passcodeW == 486251){
                System.out.println("Correct passcode.");
                break;

            } else{
                System.out.println("Incorrect Passcode. Attempts left: "+ (--attempts));
            }
        }

        if(attempts == 0){
            System.out.println("Maximum attempts reached. Access denied...");
        }

        /*Q7: Write a program that generates a random number between 1 and 20 and asks the user to guess
        the number. The user should be able to enter a new number if the number is incorrect.Note:
        Use Random to generate a random number.
        To use Random, you will have to import it first:
        import java.util.Random.*/

        int attemptsTwo = 2;

        //generate random number
        Random random = new Random();
        int randomNo = random.nextInt(20);
        //You can check generated random number adding this line--> System.out.println(randomNo);

        while(attemptsTwo > 0){
            //input
            System.out.println("Enter number between 1 and 20 :");
            int UserInput = input.nextInt();

            if (UserInput == randomNo){
                System.out.println("Your Guess is correct...");
                break;
            } else{
                System.out.println("Incorrect Passcode. Attempts left: "+ (--attemptsTwo));
            }
        }


        //end of tutorial 3












    }
}