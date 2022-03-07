package date10_11_21;

import java.util.Scanner;

public class CelciusFahranhite {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter the temp in celcius");
		int c= sc.nextInt();
		
		double f= 32+(9/5.0*c);
		System.out.println("temp in fahranhite "+f);
	}

}
