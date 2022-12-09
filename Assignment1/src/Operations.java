import java.util.Scanner;
public class Operations {
	
	public static void main(String[] args)
		{
		System.out.print("Enter two numbers: \n");
		
		Scanner obj= new Scanner(System.in);
		
		double first = obj.nextDouble();
		double second = obj.nextDouble();
		
		System.out.print("Choose an operator (+, -, *, /): \n");
		
		char operator = obj.next().charAt(0);
		
		opp(first,second,operator);
		
		}
		public static void opp(double first,double second,char operator)
		{
		
		double result;
		switch(operator)
		{
		case '+':
		result = first + second;
		System.out.println("Result for "+operator + " is : "+result);
		break;
		
		case '-':
		result = first - second;
		System.out.println("Result for "+operator + " is : "+result);
		
		break;
		
		case '*':
		result = first * second;
		System.out.println("Result for "+operator + " is : "+result);
		
		break;
		
		case '/':
		result = first / second;
		System.out.println("Result for "+operator + " is : "+result);
		
		break;
		
		default:
		
		System.out.println("Error!operator is not correct");
		break;
		
		}
		
		}	
	}
	