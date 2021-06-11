package com.techelevator;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  //initialize scanner for user input
		System.out.print("Please enter the amount of the bill: ");  //ask user to enter amount of bill
		double userBill = Double.parseDouble(scanner.nextLine());  // converted user input to double
		System.out.print("Please enter the amount tendered: ");  // ask user to enter the amount tendered
		double userTender = Double.parseDouble(scanner.nextLine()); // convert user input to double
		double changeRequired = userTender - userBill; // figure out how much change is due
		System.out.print("The change required is " + changeRequired); //output the amount of change required

		scanner.close(); // end scanner
	}

}
