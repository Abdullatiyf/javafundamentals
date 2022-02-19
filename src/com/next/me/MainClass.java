package com.next.me;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*System.out.println("Hello World");*/
		
		/**
		 *  Author: Abdu Lateef
		 *  Project: JavaFundamentals
		 *  Date: 2022.02.19
		 * 
		 * */
		
		/**
		 * Type: [tip]
		 *  -String
		 *  -Integer//long
		 *  -Double
		 *  -Float
		 *  -Char
		 *  -Boolean
		 *  -Byte
		 *  -Var//variable
		 * 
		 * */ 
		
		/*String  name= "This is my first java project";
		System.out.println(" " + name);*/
		
		/*int num1 = 17;
		int num2 = 12;
		int num3 = 7;
		
		int sum = num1 + num2 + num3;
		
		System.out.println("Sum " + sum);
		
		int num4=6, num5=9, num6=171,num7=11, num8 =-1;
		int num9,num10,num11;
		
		
		num9 = 123;
		num10 = 231;
		num11 = 200;
		
		int sum1=num4+num5+num6+num7+num8+num9+num10+num11;
		
		System.out.println("Sum " + sum1);*/
		
		/*double payoff= 546.78;
		double payoff1= 647.90;
		double payoff2= 563.90;*/
		
		/*double psum= payoff+payoff1+payoff2;
		System.out.println("Total: " + psum + "$");*/
		
		/*double psum1= payoff*payoff1*payoff2;
		System.out.println("Total: " + "$" + psum1 );*/
		

		/*double psum1= payoff/payoff1/payoff2;
		System.out.println("Total: " + "$" + psum1 );*/
		
		
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a value:");
		
		int get = scanner.nextInt();
		
		int umn1= get*3;
		
		System.out.println("umn1 =:" + umn1)*/
		
	
		
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter Your Full Name:");
		
		String fullName = scanner1.nextLine();
		
		System.out.println("Your Full Name is:" + fullName);
			scanner1.close();
		
	}
}
