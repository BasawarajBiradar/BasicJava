package date10_11_21;

import java.util.Scanner;

public class YearsDays {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("enter the number of days to be converted");
		int a= sc.nextInt();
		
		int year= a/365;
		int rem1=a%365;
		System.out.println(year+" year ");
		
		int months=rem1/30;
		int rem2=rem1%30;
		System.out.println(months+" months");
		
		int week=rem2/7;
		int days=rem2%7;
		System.out.println(week+" weeks");
		System.out.println(days+" Days");

	}

}
