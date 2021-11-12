package com.logicalprograms.demo;

import java.util.Scanner;

public class LineComparision {

	public static int distance1() {

		float x1, x2, y1, y2;
		double dis1;
		System.out.println("Enter the first line Endpoints");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 point:");
		x1 = sc.nextInt();
		System.out.println("Enter y1 point:");
		y1 = sc.nextInt();
		System.out.println("Enter x2 point:");
		x2 = sc.nextInt();
		System.out.println("Enter y2 point:");
		y2 = sc.nextInt();
		dis1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("distancebetween" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")==>" + dis1);
		int a = (int) dis1;
		return a;
	}

	public static int distance2() {

		float a1, a2, b1, b2;
		double dis2;
		System.out.println("Enter the second line Endpoints");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a1 point:");
		a1 = sc.nextInt();
		System.out.println("Enter b1 point:");
		b1 = sc.nextInt();
		System.out.println("Enter a2 point:");
		a2 = sc.nextInt();
		System.out.println("Enter b2 point:");
		b2 = sc.nextInt();
		dis2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
		System.out.println("distancebetween" + "(" + a1 + "," + b1 + ")," + "(" + a2 + "," + b2 + ")==>" + dis2);
		int b = (int) dis2;
		return b;
	}

	public static void equal(int a, int b) {

		if (a == b)
			System.out.println("Line Length L1" + a + "and Line Length L2" + b + "equal");
	}

	public static void greater(int a, int b) {
		
		 if (a > b) 
			System.out.println("Line Length L1:" +a+ " " +"is greater than Line Length L2:" +b);
		}
	
	public static void lessthan (int a, int b) {
		
		if (a < b)
			System.out.println("Line Length L1:"  + a + " " +"is lesser than Line Length L2:" + b);
	}

	public static void main(String[] args) {
		
		int a = distance1();
		int b = distance2();
		equal(a,b);
		greater(a,b);
		lessthan(a,b);
		
	}
}
