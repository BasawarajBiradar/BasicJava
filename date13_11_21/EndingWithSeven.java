package date13_11_21;

import java.util.Scanner;

public class EndingWithSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter start number");
		int start=sc.nextInt();
		System.out.println("enter the end number");
		int end=sc.nextInt();
		
		
		for(int i=start+1; i<end; i++)
		{
			if(i%10==7)
				System.out.println(i);
		}
		
		

	}

}
