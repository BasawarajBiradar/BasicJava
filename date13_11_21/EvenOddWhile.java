package date13_11_21;

import java.util.Scanner;

public class EvenOddWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter start ");
		int start=sc.nextInt();
		System.out.println("enter end");
		int end =sc.nextInt();
	
		for(int i=start; i<=end; i++ )
		{
			if(i%2==0)
				System.out.println(i+" even");
			else
				System.out.println(i+" odd");
		}
			

	}

}
