package date10_11_21;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the length side of triangle");
		int a= sc.nextInt();
		double b= Math.pow(3, 1/2.0);
		double area= b*a*a/4;
		System.out.println("area "+area);

	}

}
