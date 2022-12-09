
public class OddNumber {

	public static void main(String[] args) {
		 
		int number=20;
		Odd(number);
	}
	public static void Odd(int number) {
		 
		for (int i=1; i<=number; i++)   
		{  
		if (i%2!=0)   
		{  
		System.out.print(i + " ");  
		}  
		} 
	}

}
