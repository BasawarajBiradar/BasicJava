package date12_11_21;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sub1=50;
		int sub2=50;
		int sub3=50;
		int sub4=50;
		int sub5=50;
		int sub6=50;
		
		
		double percentage=(sub1+sub2+sub3+sub4+sub5+sub6)/6;
		
		if(percentage>=90)
			System.out.println("A");
		else if(percentage>=80)
			System.out.println("B");
		else if(percentage>=70)
			System.out.println("c");
		else if(percentage>=60)
			System.out.println("D");
		else if(percentage>=40)
			System.out.println("E");
		else
			System.out.println("F");
		
	}

}
