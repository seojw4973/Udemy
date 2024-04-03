package com.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result;
		System.out.println("Enter Number 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Number 2: ");
		int num2 = sc.nextInt();
		System.out.println("Choices Available are");
		System.out.println("1. apply\n2. subtract\n3. multiply\n4. division");
		System.out.println("Enter Choice : ");
		int choice = sc.nextInt();
		
		System.out.println("Your Choices are");
		System.out.println("Number1 " + num1 );
		System.out.println("Number2 " + num2);
		System.out.println("Choice " + choice);
		
//		performOperationUsingNestedIfElse(num1, num2, choice);
		performOperationUsingSwitch(num1, num2, choice);
		
	}

	private static void performOperationUsingNestedIfElse(int num1, int num2, int choice) {
		if(choice ==1) {
			System.out.println("Result " + (num1 + num2));
		}else if(choice ==2) {
			System.out.println("Result " + (num1-num2));
		}else if(choice==3) {
			System.out.println("Result " + (num1*num2));
		}else if(choice==4) {
			System.out.println("Result " + (num1/num2));
		}else {
			System.out.println("Invalid Operation");
		}
	}
	private static void performOperationUsingSwitch(int num1, int num2, int choice) {
		switch(choice) {
		case 1:
			System.out.println("Result " + (num1 + num2));
			break;
		case 2:
			System.out.println("Result " + (num1-num2));
			break;
		case 3:
			System.out.println("Result " + (num1*num2));
			break;
		case 4:
			System.out.println("Result " + (num1/num2));
			break;
		default:
			System.out.println("Invalid Operation");
			break;
				
		}
	}
}
