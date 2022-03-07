package date13_11_21;

import java.util.Scanner;

public class FactWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter num");
		int num=sc.nextInt();
		int fact=1;
		int i=2;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}

		System.out.println(fact);
	}

}
