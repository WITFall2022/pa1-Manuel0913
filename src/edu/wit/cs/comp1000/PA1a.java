package edu.wit.cs.comp1000;

import java.util.Scanner;
public class PA1a {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int yards;
		int feet;
		int inches;
		
		System.out.printf("Enter number of yards: ");
		yards = input.nextInt();
		
		System.out.printf("Enter number of feet: ");
		feet = input.nextInt();
		
		System.out.printf("Enter number of inches: ");
		inches = input.nextInt();
		
		int TotalInches = (yards * 36) + (feet * 12) + inches;
		System.out.printf("Toatal number of inches: %d", TotalInches);

	}

}