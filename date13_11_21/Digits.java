package date13_11_21;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	    int num=1256;
		int counter=0;
		while(num>0)
		{
			num=num/10;
			counter++;
		}

		System.out.println(counter);
	}

}
