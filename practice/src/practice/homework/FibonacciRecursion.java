package practice.homework;

import java.util.Scanner;

public class FibonacciRecursion {

	public static void main(String[] args) {
		System.out.println("enter any number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<n;i++){
		System.out.print(+fibonacci(i) + " ");
	}
	}

	private static int fibonacci(int n) {
		
		if(n==1||n==2){
	
		return 1;
		}
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}

}
