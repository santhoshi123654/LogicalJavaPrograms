package com.logicalprograms.demo;

import java.util.Scanner;

public class FlipCoin {
	
	public static void main(String[] args) {
		int headCount =0;
		int tailCount = 0;
		double headPercentage ;
		double tailPercentage ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of times the coin is rolled : ");
		int num = sc.nextInt();
		for (int i = 0 ;i <num ; i++) {
			if(Math.floor(Math.random()* 10.0) % 2.0 == 0.0) {
				
				headCount++;
			}
			else {
				
				tailCount++;
			}
			
		}
		headPercentage = (headCount *100) / num ;
		tailPercentage = (tailCount*100) / num ;
		
		System.out.println("Number of times the heads obtained : " +headCount);
		System.out.println("Number of times the tails obtained :" +tailCount);
		System.out.println("Heads Percentage is :" +headPercentage + "%");
		System.out.println("Tails Percentage is :"+tailPercentage + "%");
		
	}
	
}
