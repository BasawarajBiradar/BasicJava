package date10_11_21;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter 1st number");
		int a= sc.nextInt();
		System.out.println("enter 2nd number");
		int b= sc.nextInt();
		
		int c=a/b;
		System.out.println("answer "+c);
	}

}
