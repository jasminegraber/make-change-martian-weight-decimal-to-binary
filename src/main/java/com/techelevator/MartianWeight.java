package com.techelevator;

import java.util.Scanner;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // initialize scanner for user input
		System.out.print("Enter a series of Earth weights (space-separated): "); // ask user to enter weights
		String userEarthWeights = scanner.nextLine(); // store the user input into a string variable

		String[] earthWeightsArray = userEarthWeights.split(" "); // creates an array of user's weights and puts a space in between


		for (int i = 0; i < earthWeightsArray.length; i++){ // loop through each weight that is entered
			double earthWeight = Double.parseDouble(earthWeightsArray[i]); // convert the string to double
			double weightOnMars = earthWeight * 0.378; // calculate the weight on Mars
			System.out.println((int)earthWeight + " lbs. on Earth, is " + (int)weightOnMars + " lbs. on Mars."); // output

		}

		scanner.close(); // end scanner



	}

}
