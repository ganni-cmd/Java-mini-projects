package com.ganni.miniproj;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter two numbers :");
		
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			System.out.println("\n Enter any one operation to be performed + - / * % ");
			char operator = sc.next().charAt(0);
			
			double result=0;
			
			switch (operator) {

			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;

			default:
				System.out.println("Invalid input");
				break;
			}
			System.out.println(num1 +" "+ operator +" " + num2 + " = "+result);
		}

	}

}
