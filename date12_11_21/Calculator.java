package date12_11_21;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b=4;
		char operation='/';
		
		switch(operation)
		{
		case '+':
			System.out.println("addition "+(a+b));
			break;
		case '-':
			System.out.println("subtraction "+(a-b));
			break;
		case '*':
			System.out.println("multiplication "+(a*b));
			break;
		case '/':
			System.out.println("division the quotient is "+(a/b)+" the reminder is "+(a%b));
			break;	
		default:
			System.out.println("invalid operation");
		}

	}

}
