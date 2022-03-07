package date13_11_21;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		int fact=1;
		
		for (int i=2; i<=num; i++)
			fact=fact*i;
		System.out.println(fact);

	}

}
