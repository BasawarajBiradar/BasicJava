package date10_11_21;

import java.util.Scanner;

public class AreaPerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		System.out.println("enter length of rectangel");
		int l= sc.nextInt();
		System.out.println("Enter breadth of rectangle ");
		int b= sc.nextInt();
		
		int area=l*b;
		int peri=2*(l+b);
		
		System.out.println("area "+area);
		System.out.println("perimeter "+peri);

	}

}
