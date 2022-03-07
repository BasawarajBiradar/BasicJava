package date13_11_21;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);

		System.out.println("enter number ");
		int num=sc.nextInt();
		int num2=0;
		int temp=num;
		
		while(num>0)
		{
			 num2=num2*10+num%10;
			num=num/10;
			
		}
		
		System.out.println(temp);
		System.out.println(num2);
		if(temp==num2)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}
	

}
