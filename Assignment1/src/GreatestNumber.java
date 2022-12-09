
public class GreatestNumber {

	public static void main(String[] args) {
		int a=7, b=5, c=10;
		greatestnum(a,b,c);
	 
	}
	public static void greatestnum(int a,int b,int c) {
		if(a>b) {
			if(a>c) {
				System.out.println("Greater Number is :"+a);
			}
			else {
				System.out.println("Greater Number is :"+c);
			}
			
		}
		else {
			if(b>c) {
				System.out.println("Greater Number is :"+b);
			}
			else {
				System.out.println("Greater Number is :"+c);
			}
		}
		
	}

}
