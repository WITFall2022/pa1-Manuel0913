package edu.wit.cs.comp1000;

import java.util.Scanner;
public class PA1b {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int inches;
		System.out.printf("Enter number of inches:");
		inches = input.nextInt();
		
		int yards = inches / 36;
		int inchesf = inches % 36;
		int feet = inchesf / 12;
		int inches1 = inches % 12;
		
		System.out.printf("Yards: %d%n", yards);
		System.out.printf("feet: %d%n", feet);
		System.out.printf("inches1: %d%n", inches1);
		

	}

}