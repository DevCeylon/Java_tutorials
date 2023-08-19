import java.util.Scanner;
public class tutorial_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Methods
        /* Q1: Write a program that calls a method to print “Hello world”*/
        hello();


        /*Q2: Write a program in Java that prints the numbers 1 to 100 without using a loop. Call the method from the main.
         You can use parameters if you need.*/
        //Q3 method
        printNumbers(1);



        /* Q3:Write a program that computes exponents. The program should ask the user to input
              a number (int) and an exponent (int) and return the result. You cannot use a loop,
              you have to use recursion (a method that calls itself).  */

        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        int result = computeExponent(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        /* Q4: Let t(n) be a sequence defined for all non–negative integers by the following recursive
               definition:
               t(0) = 1 t(1) = 3 t(n) = t(n-2)
                      + t(n-1), for n≥2
                      Write a program in Java that finds out the value of t(4) using recursion.*/

        int n = 4;
        int resultN = calculateT(n);
        System.out.println("t(" + n + ") = " + resultN);

        /* Q6: Write a program for a calculator that first displays the following menu:
          ************
              MENU
          ************
          * 1.- Addition
          * 2.- Subtraction
          * 0.- Quit Please select
          * an option:
            Then, when the user selects 1, the program should call a method to perform an addition by asking the
            user to introduce two double numbers. When the user selects 2, the program should call a method to perform a subtraction,
            *  by asking the user to introduce two double numbers. After performing the operation, the program should
            * ask the user to select an option again. When the user selects 0, the program should end.
            * Note: Since option 1 and 2 both need to read two double numbers, you can also do that in a separate method
            *  (to avoid repetition) by returning an array with the 2 double values*/
        while (true) {
            System.out.println("**********MENU**********");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("0. Quit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 0:
                    System.out.println("Quitting the calculator. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please select again.");
            }
        }

    }

    //Q1: Method
    private static void hello() {
        System.out.println("Hello, World!");
    }


    //Q2: Methods
    public static void printNumbers(int n){
        if(n <= 100){
            System.out.println(n);
            printNumbers(n+1);
        }
    }

    //Q3: Methods
        public static int computeExponent(int base, int exponent) {
            if (exponent == 0) {
                return 1; // Any number raised to the power of 0 is 1
            } else {
                return base * computeExponent(base, exponent - 1);
            }
        }

    //Q4 : Method
    public static int calculateT(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 3;
        } else {
            return calculateT(n - 2) + calculateT(n - 1);
        }
    }


    //Q6: Methods
    public static void addition(){
        double[] numbers = getNumbers();
        double result = numbers[0] + numbers[1];

        System.out.println("Result: "+result);
    }

    public static void subtraction(){
        double[] numbers = getNumbers();
        double result = numbers[0] - numbers[1];

        System.out.println("Result: "+result);
    }

    public static double[] getNumbers(){
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[2];

        System.out.println("Enter number one: ");
        numbers[0] = input.nextDouble();

        System.out.println("Enter number two: ");
        numbers[1] = input.nextDouble();

        return numbers;
    }








}