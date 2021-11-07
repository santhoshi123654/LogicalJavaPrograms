package com.logicalprograms.demo;
import java.util.Scanner;

public class Coupon {
	
	public static int getCoupon(int n) {
		return (int) (Math.random()*n);
	}
	
	public static int collect(int n) {
		boolean [] isCollected = new boolean[n];
		int count = 0;
		int distinct = 0;
	
	   while(distinct < n) {
		   int value =getCoupon(n);
		   count++ ;
		   
		   if(!isCollected[(int) value]) {
			   distinct ++;
			   isCollected[(int) value] = true;
		   }   
		 }
	   			return (int) count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Coupon Number:");
		int n=sc.nextInt();
		//double n = Double.parseDouble(args[0]);	
		int count = collect((int) n);
		System.out.println(count);
		
	}
}
