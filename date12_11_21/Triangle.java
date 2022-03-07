package date12_11_21;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=12;
		int b=12;
		int c=12;
		
		
		
		if(a==b && b==c)
			System.out.println("equilateral");
		else if(a==b || b==c || a==c)
			System.out.println("iso");
		else
			System.out.println("scelene");

	}

}
