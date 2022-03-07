package date13_11_21;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		System.out.println("enter number");
		int num=sc.nextInt();
		boolean mynumberisprime=true;
		
		for (int i=2; i<=num-1; i++ )
		{
			if (num%i==0)
				mynumberisprime=false;
				
		}

		if(mynumberisprime==true)
			System.out.println("prime number");
		else
			System.out.println("number is not prime");
	}

}
