package DEMO;

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int n)
	{
		if (n==1)
			return 1;
		else
			return n*factorial(n-1);
			
	}
	
	
	public static void main ( String[] argx)
	{
		int n;
		long factorial = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Factorial program \n Enter an integer");
		do {
			
		n = sc.nextInt();
		
		if(n>25)
			System.out.println("Number too large \n Renter number <25");
		
		}while (n > 25);
		
		/*
		 * for (int i=1; i <= n ; i++)

		{
			factorial = factorial*i;
		}		 */
		/*int i=1;
		while( i<=n)
		{
			factorial = factorial*i;
			i++;
		}*/
	/*	int i=1;
		do {
			factorial = factorial*i++;
		}while( i <= n);*/
		
		
		System.out.println("Factorial= "+ factorial(n));
		
		
		
	}

}
