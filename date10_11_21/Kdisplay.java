package date10_11_21;

import java.util.Scanner;

public class Kdisplay {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		System.out.println("enter value of K");
		 
		 int k= sc.nextInt();

		 System.out.println(k++ - ++k + k-- - k++ + ++k -k-- + --k +k+ k--- k + --k+ k++);
	

	}

}
