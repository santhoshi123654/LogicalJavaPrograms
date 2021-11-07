package com.logicalprograms.demo;

import java.util.Scanner;

public class HarmonicNumber {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Harmonic Number : ");
			int num = sc.nextInt();
			double result = 0.0 ;
			for(int i = num; i > 0; i--) {
				result = result + (double)1 / i;
				System.out.println("The Harmonic Number is : "  + result);
			}
		}

}
