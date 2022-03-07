package date13_11_21;

import java.util.Scanner;

public class PrimeEvenOdd {

	public static void main(String[] args) {

         Scanner sc=new Scanner (System.in);
		
	    System.out.println("enter 1 for prime \n enter 2 for even\n enter 3 for odd");
		int ip=sc.nextInt();
		if(ip==1)
		{   
			System.out.println("prime number are");
			System.out.println("1\n2");
			int num=3;
			while(num<=100)
			{
				boolean primenumber=true;

				for(int i=2; i<num; i++)
				{
					if(num%i==0)
					{
						primenumber=false;
					}
				}
				if(primenumber==true)
					System.out.println(num);
				num++;
			}
		}
		else if(ip==2)
		{
			System.out.println("even numbers are");
			 int num=100;
			 for(int i=3; i<=num; i++)
			 {
				 if(i%2==0)
					 System.out.println(i);
			 }
		}
		else if(ip==3)
		{
			System.out.println("odd numbers are");
			int num=100;
			for(int i=1;i<=num;i++)
			{
				if(i%2!=0)
					System.out.println(i);
			}
			
		}
		else
			System.out.println("invalid input");
		
	}
}
