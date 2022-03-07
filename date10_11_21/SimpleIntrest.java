package date10_11_21;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("enter principal amount");
		int p= sc.nextInt();
		System.out.println("Enter rate of intrest");
		int r= sc.nextInt();
		System.out.println("Enter number of years");
		int n= sc.nextInt();
		
		int amount= p*n*r/100;
		System.out.println("amount "+amount);

	}

}
