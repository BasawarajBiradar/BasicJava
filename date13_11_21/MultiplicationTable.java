package date13_11_21;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter num");
		int num=sc.nextInt();
		
		for(int i=1; i<=10; i++)
			System.out.println(num*i);

	}

}
