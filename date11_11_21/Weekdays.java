package date11_11_21;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number of day");
		int num=sc.nextInt();
		
		if(num==1)
			System.out.println("monday");
		 else if(num==2)
			System.out.println("tuesday");
	    else if(num==3)
			System.out.println("wednesday");
		 else if(num==4)
			System.out.println("thursday");
		 else if(num==5)
			System.out.println("friday");
		 else if(num==6)
			System.out.println("saturday");
		 else if(num==7)
			System.out.println("sunday");
		 else
		   System.out.println("invalid");
				
		
		

	}

}
