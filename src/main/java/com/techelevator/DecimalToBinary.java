package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // initialize scanner to allow for user input
		System.out.print("Please enter in a series of decimal values (separated by spaces): "); // ask user for decimal values
		String userDecimals = scanner.nextLine(); // store user's input into a string variable
		String[] userDecimalsArray = userDecimals.split(" "); // create an array to hold series of values with a space in between

		for (int i = 0; i < userDecimalsArray.length; i++) { // loops through the user's series of decimal values
			int decimalNumber = Integer.parseInt(userDecimalsArray[i]); // convert the array into integers

			String binaryNumber = Integer.toBinaryString(decimalNumber); // method easily converts decimal to binary

			System.out.println(decimalNumber + " in binary is " + binaryNumber); // print out user decimal to binary

			scanner.close(); // end scanner

		}
	}

}
