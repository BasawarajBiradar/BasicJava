package date10_11_21;

import java.util.Scanner;

public class ArithmaticOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter the 1st number");
		int a= sc.nextInt();
		System.out.println("enter 2nd number");
		int b= sc.nextInt();
		
		int add=a+b;
		int sub=a-b;
		int multi=a*b;
		int div=a/b;
		int rem=a%b;
		
		System.out.println(add+" addition");
		System.out.println(sub+" subtraciton");
		System.out.println(multi+" multiplication");
		System.out.println(div+" division");
		System.out.println(rem+" remainder");

	}

}
