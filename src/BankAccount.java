import java.util.Scanner;

public class BankAccount {
	int account_number;
	String account_holder;
	 int balance;
	
	BankAccount(){
		System.out.println("Const1");
	}
	
	BankAccount(int an, String ah, int b){
		System.out.println("Const2");
		account_number=an;
		account_holder=ah;
		balance=b;
	}
	
	public void deposit() {
		int amount;
		System.out.println("Enter the amount to be deposited: ");
		amount=sc.nextInt();
		balance=balance+amount;
	}
	
	void withdraw() {
		int amount;
		System.out.println("Enter the amount to be withdrawn: ");
		amount=sc.nextInt();
		if(balance<amount) {
			System.out.println("Insufficient balance");
		}
		else {
			balance=balance-amount;
		}
	}
	
	void display() {
		System.out.println("Balance: "+balance);
	}
	
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account holder: ");
		String a=sc.next();
		System.out.println("Enter account number: ");
		int z=sc.nextInt();
		System.out.println("Enter account balance: ");
		int c=sc.nextInt();
		
		BankAccount u=new BankAccount(z,a,c);
		
		boolean flag=true;
		
		do {
		System.out.println("Select from the following choice: ");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Balance");
		System.out.println("4. Exit");
		
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1: u.deposit();
				u.display();
				break;
		case 2: u.withdraw();
				u.display();
				break;
		case 3: u.display();
				break;
		case 4: flag=false;
				break;
		default: System.out.println("INVALID");
		}
		}while(flag);
		System.out.println("ThankYou!");
	}

}
