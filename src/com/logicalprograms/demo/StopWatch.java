package com.logicalprograms.demo;

import java.util.Scanner;

public class StopWatch {

		public static void main(String[] args) {
			System.out.println("Welcome to StopWatch Program");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 0 to start :");
			long startTime =System.currentTimeMillis();
			sc.nextLong();
			System.out.println("Enter 1 to stop :");
			sc.nextLong();
		long finishTime = System.currentTimeMillis();
		long elapsedTime = (finishTime - startTime) / 1000 ;
		System.out.println("The time between start and stop is :" +elapsedTime);
			
	}

}