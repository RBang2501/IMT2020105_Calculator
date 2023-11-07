package org.example;
import java.util.Scanner;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static int addition(int a, int b) {
        return a + b;
    }
    public static int subtraction(int a, int b) {
        return a - b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static double division(int a, int b) {
        if (b == 0) {
            System.out.println("Sorry ! " +
                    "division  by possible");
            return 0;
        }
        else {
            return (double) a / b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator!!");
        while(true){
            System.out.println("Here are the operations. Please Select Your Choice.");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            int operation = sc.nextInt();
            if(operation == 5){
                System.out.println("Thankyou!");
                break;
            }
            System.out.println("Enter the two Numbers: a b");
            int a = sc.nextInt();
            sc.nextLine();
            int b = sc.nextInt();
            sc.nextLine();
            if(operation == 1){
                System.out.println(addition(a, b));
            }
            else if (operation == 2){
                System.out.println(subtraction(a, b));
            }
            else if(operation ==3){
                System.out.println(multiplication(a, b));
            }
            else if(operation == 4)
            {
                System.out.println(division(a, b));
            }

        }
    }
}

