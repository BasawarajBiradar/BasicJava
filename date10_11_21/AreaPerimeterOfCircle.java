package date10_11_21;

import java.util.Scanner;

public class AreaPerimeterOfCircle {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter the radius of circle ");
		int r= sc.nextInt();
		double pi=3.14;
		
		double area= pi*r*r;
		double peri= 2*pi*r;
		
		System.out.println("area "+area);
		System.out.println("perimeter "+peri);
		
		
	}

}
