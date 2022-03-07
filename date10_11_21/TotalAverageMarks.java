package date10_11_21;

import java.util.Scanner;

public class TotalAverageMarks {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		System.out.println("enter marks of 1st subject");
		int a= sc.nextInt();
		System.out.println("enter marks of 2nd subject");
		int b= sc.nextInt();
		System.out.println("enter marks of 3rd subject");
		int c= sc.nextInt();
		System.out.println("enter marks of 4th subject");
		int d= sc.nextInt();
		System.out.println("enter marks of 5th subject");
		int e= sc.nextInt();
		System.out.println("enter marks of 6th subject");
		int f= sc.nextInt();
		
		int total= a+b+c+d+e+f;
		System.out.println("total marks "+total);
		
		double avg= total/6;
		System.out.println("average marks "+avg);

	}

}
