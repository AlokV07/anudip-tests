
public class BankMain {

	public static void main(String[] args) {
		// create instance of bank A
		BankA a = new BankA();
		// create instance of bank B
		BankB b = new BankB(); 
		// create instance of bank C
		BankC c = new BankC();
		//Print the balance
		System.out.println("Rs." +a.getBalance(1000));

		System.out.println("Rs." +b.getBalance(1500));

		System.out.println("Rs." +c.getBalance(2000));

	}

}
