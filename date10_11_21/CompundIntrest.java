package date10_11_21;

import java.util.Scanner;

public class CompundIntrest {

	public static void main (String[] args) {
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println(" Enter principal amount");
		int p= sc.nextInt();
		System.out.println("Enter rate of intrest");
		int r= sc.nextInt();
		System.out.println("Enter number of times need calculate CI in a year");
		int n= sc.nextInt();
		System.out.println("Enter the number of years");
		int y= sc.nextInt();
		
		double a= 1+ (r/(n*100.0));
		int b= n*y;
		double amount= p*Math.pow(a, b);
		
		System.out.println("amount "+amount);
		
		
	}
}
