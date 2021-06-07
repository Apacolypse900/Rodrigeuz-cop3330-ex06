package com.examples;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myObj = new Scanner(System.in);

        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("What is your current age? ");
            String CurrentAgeString = myObj.nextLine();
            int CurrentAgeNumber = Integer.parseInt(CurrentAgeString);

        System.out.print("At what age would you like to retire? ");
            String RetireAgeString = myObj.nextLine();
            int RetireAgeNumber = Integer.parseInt(RetireAgeString);

        int YearsLeft = RetireAgeNumber - CurrentAgeNumber;
        int YearRetire = year + YearsLeft;

        System.out.println("You have " + YearsLeft + " years left until you can retire");

        System.out.println("Its 2021, so you can retire in " + YearRetire );
    }
}
