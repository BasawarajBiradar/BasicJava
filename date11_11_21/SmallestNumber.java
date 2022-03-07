package date11_11_21;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner (System.in);
		System.out.println("enter the 1st number");
		int num1=sc.nextInt();
		System.out.println("enter the 2nd number");
		int num2=sc.nextInt();
		System.out.println("enter the 3rd number");
		int num3=sc.nextInt();
		
		
		if(num1<num2 && num1<num3)
			{
			System.out.println(num1+" is smallest");
			}
		else if(num2<num1 && num2<num3)
			{
			System.out.println(num2+" is smallest");
			}
		else
			{
			System.out.println(num3+" is smallest");
			}

	}

}
