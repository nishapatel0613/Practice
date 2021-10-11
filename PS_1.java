import com.sun.tools.javac.util.Convert;

import java.util.Scanner;

public class PS_1 {
    public static void main(String[] args) {
//        Chapter 1 – Practice Set
//       1. Write a program to sum three numbers in Java.
//       2. Write a program to calculate CGPA using marks of three subjects (out of 100)
//       3. Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
//       4. Write a Java program to convert Kilometers to miles.
//        5.Write a Java program to detect whether a number entered by the user is an integer or not.


        //    Question 1

//        int a = 3;
//        int b = 4;
//        int c = 6;
//        int sum = a + b + c;
//        System.out.println(sum);

        //   Question 2
//        float sub1 = 45;
//        float sub2 = 95;
//        float sub3 = 48;
//        float cgpa = (sub1 + sub2 + sub3)/30;
//        System.out.println(cgpa);

        //    Question 3
//        System.out.println("What is your name?");
//        Scanner sc = new Scanner(System.in);
//        String name = sc.next();
//        System.out.println("Hello " + name + " Have a good day");

//             Question 4
        System.out.println("Enter Kilometer");
        Scanner sc = new Scanner(System.in);
        double kilometer = sc.nextDouble();
        double miles = kilometer * 0.621371;
        System.out.println("Your distance in miles is " + miles);

        //     Question 5
//        System.out.println("Enter your number");
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.hasNextInt());




    }


}
