package date13_11_21;

import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		int counter=0;
		
		for (int i=2; i<=num-1; i++)
		{
			if(num%i==0)
			{
				counter++;
				break;
			}
			
		}
		if(counter==0)
			System.out.println("number is prime");
		else 
			System.out.println("number is not prime");

	}

}
