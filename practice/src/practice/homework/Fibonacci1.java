package practice.homework;

import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {
		System.out.println("Enter any number to generate fibonacci sequence:");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		fibonacci(i);
	}
	 public static void fibonacci(int n) {
	       if (n == 0) {
	           System.out.println("0");
	       } else if (n == 1) {
	           System.out.println("0 1");
	       } else {
	           System.out.print("0 1 ");
	           int a = 0;
	           int b = 1;
	           for (int i = 1; i < n; i++) {
	               int nextNumber = a + b;
	               System.out.print(nextNumber + " ");
	               a = b;
	               b = nextNumber;
	           }

	}
	 }
}


