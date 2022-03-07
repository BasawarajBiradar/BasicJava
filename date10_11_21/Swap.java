package date10_11_21;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println(" enter 1st number");
		int a= sc.nextInt();
		System.out.println("enter 2nd number");
		int b= sc.nextInt();
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("After swap");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("swap without variable");
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		

	}

}
