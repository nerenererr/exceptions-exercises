import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();

    }

    public static void tryCatchEj1() {

        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Please enter a number");
            int num1 = sc.nextInt();
            System.out.println("Please enter another number");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number");
        } catch (ArithmeticException e) {
            System.out.println("The second number cannot be 0");
        }

    }

    public static void tryCatchEj2() {

        int[] numbers = {11, 22, 33};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Please enter a number");
            int index = sc.nextInt();
            System.out.println("The number in the position " + index + " is " + numbers[index]);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number");
        } catch (ArrayIndexOutOfBoundsException e)  {
            System.out.println("The number you entered is out of bounds");
        }
    }

    public static void tryCatchEj3() {

        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean validNumber = false;
        while (!validNumber) {
            try {
                System.out.println("Please enter a number");
                number = sc.nextInt();
                validNumber = true;

            } catch (InputMismatchException e) {
                System.out.println("Error");
                sc.next();
            }
        }
        System.out.println("≽^•⩊•^≼");

    }

    public static void throwEj() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the year of your birth");
            int birthYear = sc.nextInt();
            sc.nextLine();

            int age =
        } catch (InputMismatchException e)  {
            System.out.println("Error: please enter a ");
        }

    }
}