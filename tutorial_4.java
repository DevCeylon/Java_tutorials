import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
public class tutorial_4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        /*Q1: Write a program that creates an array of integers with dimension 10 (10 positions).
         Ask the user to introduce 10 marks and store them in the array. Then, display the 10 values in the
         array and calculate the number of students who have failed (mark lower than40) and the average mark.
         Print the number of students who have failed and the average
         */

        //create array
        int[] marks = new int[10];
        int failedCount = 0;
        int totalMarks = 0;

        System.out.println("Enter 10 Marks: ");

        for(int i=0 ; i < marks.length ; i++){
            System.out.println("Mark "+(i+1)+" : ");
            marks[i] = input.nextInt();

            if (marks[i] < 40){
                failedCount++;
            }
            totalMarks += marks[i];
        }

        //display entered marks
        System.out.println("Marks Entered: ");

        for(int i=0 ; i<marks.length ; i++){
            System.out.println("Mark "+(i+1)+" : "+marks[i]);
        }

        //calculate average mark
        double averageMark = (double) totalMarks / marks.length;

        //final output
        System.out.println("Students who failed: "+failedCount);
        System.out.println("Average marks: "+averageMark);

        /*Q2: Write a program where an array of length 10 is filled with doubles. The user then inputs 2 integer values i and j and the values
        in the array position i and j are swapped around.The program should then print out the contents of the array.
         What happens if i or j are larger than 10?
         */

        //create array
        double[] array = new double[10];

        //fill the array
        for(int l=0 ; l< array.length ; l++){
            array[l] = l + 1.0;
        }

        //inputs
        System.out.println("Enter two integer values as i and j: \n");
        System.out.println("Enter i: ");
        int i = input.nextInt();
        System.out.println("Enter j: ");
        int j = input.nextInt();

        //check the condition and swap
        if(i >= 0 && i < 10 && j >= 0 && j < 10){
            double swap = array[i];
            array[i] = array[j];
            array[j] = swap;

            System.out.println("Array after swapping: ");
            for(double value:array){
                System.out.println(value + " ");
            }
        }else{
            System.out.println("Invalid input");
        }

        /*Q3:Given the set (array) A = {2, 3, 4, 5, 6, 7, 8, 9}
        find all elements of set A that are:
        a) Even numbers
        b) Those numbers that being multiplied by 2 give a number that is also an element of A.
        Write a Java program that calculates and prints the solution of the previous two tasks.
        Note: To find if a number is even or odd, you can calculate the remainder of a division by using the operator %.
        An even number is a number that is divisible by 2 and generates a reminder of 0. */

        //Method 1:
        int[] setA = {2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Even numbers in set A:");
        for (int num : setA) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        System.out.println("Numbers that, when multiplied by 2, give another element in set A:");
        for (int num : setA) {
            int doubled = num * 2;
            boolean found = false;

            for (int element : setA) {
                if (doubled == element) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.print(num + " ");
            }
        }

        System.out.println();

        /*Q4: Multi-dimensional arrays.
        Write a Java program that asks 3 marks (integers) of 5 students (each student will have 3 marks).
        Use a multidimensional array to store the marks and find the average of each student. */

        int[][] studentMarks = new int[5][3];

        for(int k = 0 ; k < studentMarks.length ; k++){
            System.out.println("Enter marks for student"+(k+1)+": ");
            for(int m = 0 ; m < studentMarks[i].length ; m++){
                System.out.println("Mark"+(m+1)+": ");
                studentMarks[k][m] = input.nextInt();
            }
        }

        //find average marks for each student
        for(int n=0 ; n < studentMarks.length ; n++){
            int sum = 0;
            for(int o = 0 ; o < studentMarks[n].length ; o++){
                sum += studentMarks[n][o];
            }

            double average = (double) sum / studentMarks[n].length;
            System.out.println("Average marks for student "+(n+1)+": "+average);

        }
        /*Q5: A fair die is rolled twice and we get two numbers
        X = result of the first roll and Y =result of the second roll.
        a) What is the probability that X = 4?
        b) What is the probability that Y = 4?
        c) What is the probability that both X = 4 and Y = 4?
        Write a program in Java that simulates this scenario 1,000 times (you roll two dice 1,000 times) and estimates the probabilities.
        How good is your simulation? Is it any better if you increase the number of simulations to 1,000,000?
        Note: You can use the Java class Random to generate random numbers (you will need to import java.util.Random.
        You can then create a generator: Random generator = newRandom();
         */

        Random random = new Random();
        int totalSimulations = 1000;
        int countX = 0;
        int countY = 0;
        int countXnY = 0;

        for(int k=0 ; k < totalSimulations ; k++){
            int x = random.nextInt(6) + 1;
            int y = random.nextInt(6) + 1;

            if (x == 4){
                countX++;
            }
            if(y == 4){
                countY++;
            }
            if(x == 4 && y == 4){
                countXnY++;
            }
        }
        //X count and Y count
        System.out.println("X count: "+countX);
        System.out.println("Y count: "+countY);

        //probability
        double probX = (double) countX / totalSimulations;
        double probY = (double) countY / totalSimulations;
        double probXnY = (double) countXnY / totalSimulations;

        System.out.println("Estimated probability that X= 4: "+probX);
        System.out.println("Estimated probability that Y= 4: "+probY);
        System.out.println("Estimated probability that X and Y = 4: "+probXnY);

        /*Q6: Write a program that reads in and stores 10 student marks and then reduces each mark by 10% (because it was 24 hours late).
        Use a loop to reduce each mark. Each reduced mark is then stored in the same element of the array.
        You should then output the contents of the array.
         */

        //create an array for store marks
        int[][] orgMarks = new int[10][1];

        // Input marks
        for (int k = 0; k < orgMarks.length; k++) {
            System.out.println("Enter marks for Student " + (k + 1) + ": ");
            orgMarks[k][0] = input.nextInt();
        }

        // Reduce marks
        for (int k = 0; k < orgMarks.length; k++) {
            orgMarks[k][0] = (int) (orgMarks[k][0] - orgMarks[k][0] * 0.1);
        }

        // Output modified marks
        System.out.println("\nModified student marks after reducing by 10%:");
        for (int k = 0; k < orgMarks.length; k++) {
            System.out.println("Reduced marks for Student " + (k + 1) + ": " + orgMarks[k][0]);
        }

        /* Q7: Write a program that reads in 100 doubles and stores them in an array called nums.
         The program should then print out the largest number.
         */

        //create and array
        double nums[] = new double[5];

        //inputs
        int l = 0;
        for (double k = 0; k < 5; k++) {
            System.out.println("Enter Number: ");
            double doubNums = input.nextDouble();
            nums[l] = doubNums;
            l++;
        }
        double highestNumber = 0;
        for (double Numbers : nums) {
            if (Numbers > highestNumber) {
                highestNumber = Numbers;
            }

            System.out.println("Highest Number is: " + highestNumber);

        /* Q8: Write a program that reads in a sequence of ints into an array. The program should then
         shift each value on one position in the array. For example, whatever is in array position 4 should
         be moved into position 5. Whatever is in the last should be moved to the start.
         The program should then print out the contents of the array*/

            System.out.println("How many intArray do you want to add? ");
            int numOfInts = input.nextInt();

            int[] intArray = new int[numOfInts];

            for (int k = 0; k < intArray.length; k++) {
                System.out.println("Enter Integers as one by one: ");
                intArray[k] = input.nextInt();
            }

            System.out.print("Original array: ");
            for (int num : intArray) {
                System.out.print(num + " ");
            }

            // Shifting the array
            int lastValue = intArray[numOfInts - 1];
            for (int k = numOfInts - 1; k > 0; k--) {
                intArray[k] = intArray[k - 1];
            }
            intArray[0] = lastValue;

            System.out.print("\nShifted array: ");
            for (int num : intArray) {
                System.out.print(num + " ");
            }

        /* Q9 :Write a program where an array of length 20 say is filled with doubles.
        The user then inputs any two integer values a and b and the values in the array
        positions a and b are swapped around. The program should then print out the contents of the array.
         */

            //define arraylength
            int arrayLength = 20;

            //create an array
            double[] arrayForNine = new double[arrayLength];

            //fill array with doubles
            for (int k = 0; k < arrayForNine.length; k++) {
                System.out.println("Enter value " + (k + 1) + ": ");
                arrayForNine[k] = input.nextInt();
            }

            //original array
            for (double items : arrayForNine) {
                System.out.println(items);
            }

            System.out.println("Enter the first index to swap(a): ");
            int a = input.nextInt();

            System.out.println("Enter the second index to swap(b): ");
            int b = input.nextInt();

            //swap
            if (a > 0 && a < arrayForNine.length && b > 0 && b < arrayForNine.length) {
                double temp = arrayForNine[a];
                arrayForNine[a] = arrayForNine[b];
                arrayForNine[b] = temp;

            } else {
                System.out.println("Invalid index...");
            }

            //swapped array
            for (double items : arrayForNine) {
                System.out.println(items);
            }


            /* Q10: Write a program to get 10 Integers from the user and store them in an array called myNamesArray.
            then clone the Integers in the myNames into an ArrayList called myNamesArrayList.
            Sort the myNamesArrayList using the sort method.*/

            //create an array
            int[] myNamesArray = new int[10];

            //input values and store in array
            for(int k=0 ; k < myNamesArray.length ; k++){
                System.out.println("Enter value "+(k+1)+": ");
                myNamesArray[k] = input.nextInt();
            }

            ArrayList<Integer> myNamesArrayList = new ArrayList<>();
            for(int value : myNamesArray){
                myNamesArrayList.add(value);
            }

            Collections.sort(myNamesArrayList);

            System.out.println("Sorted ArrayList: "+myNamesArrayList);

            /*How do you find all pairs whose sum is equal to a given number from an integer array in Java?
            You have given an array of int primitives and a number, you need to find all pairs in an array
             whose sum is equal to given number e.g. if an array is {1, 2,3, 4, 5} and given sum is 6
             then your program should return {2, 4} and {1, 5}.*/

            int[] arrayPairs = {1,2,3,4,5};

            //input number
            System.out.println("Enter number: ");
            int numSum = input.nextInt();

            //process
            for(int k=0 ; k < arrayPairs.length ; k++){
                for(int h= k+1 ; h < arrayPairs.length ; h++){
                    if(arrayPairs[k] + arrayPairs[h] == numSum){
                        System.out.println("{"+arrayPairs[k]+","+arrayPairs[h]+"}");
                    }
                }
            }


            //End of Tutorial_4
















        }
    }
}
