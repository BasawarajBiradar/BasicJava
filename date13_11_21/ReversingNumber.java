package date13_11_21;

import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter the number");
		int num=sc.nextInt();
		int num2=0;
		
		while (num>0)
		{
			num2=(num2*10)+(num%10);
			num=num/10;
		}

		System.out.println(num2);
	}

}
