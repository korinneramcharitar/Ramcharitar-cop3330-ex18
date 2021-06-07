/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Korinne Ramcharitar
 */




package base;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius." + "\n" + "Press F to convert from Celsius to Fahrenheit.");
        String temp = input.nextLine();
        if (temp.equals("C")) {
            System.out.println("Your choice: C");
            System.out.println("Please enter the Temperature in Fahrenheit:");
            String temp1 = input.nextLine();
            int a = Integer.parseInt(temp1);
            int permtemp1 = ((a - 32) * 5 / 9);
            System.out.println("The temperature in Celsius is " + permtemp1 + ".");
        }

        if (temp.equals("c")) {
            System.out.println("Your choice: C");
            System.out.println("Please enter the Temperature in Fahrenheit:");
            String temp1 = input.nextLine();
            int a = Integer.parseInt(temp1);
            int permtemp1 = ((a - 32) * 5 / 9);
            System.out.println("The temperature in Celsius is " + permtemp1 + ".");
        }
        if (temp.equals("F")) {
            System.out.println("Your choice: C");
            System.out.println("Please enter the Temperature in Fahrenheit:");
            String temp1 = input.nextLine();
            int a = Integer.parseInt(temp1);
            int permtemp1 = ((a - 32) * 5 / 9);
            System.out.println("The temperature in Celsius is " + permtemp1 + ".");
        }
        if (temp.equals("f")) {
            System.out.println("Your choice: C");
            System.out.println("Please enter the Temperature in Fahrenheit:");
            String temp1 = input.nextLine();
            int a = Integer.parseInt(temp1);
            int permtemp1 = ((a - 32) * 5 / 9);
            System.out.println("The temperature in Celsius is " + permtemp1 + ".");
        }
        }
        }

