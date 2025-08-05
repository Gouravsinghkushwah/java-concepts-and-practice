package javaConceptsAndPractice.Encapsulation;

public class TestBankAccount {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(100.00);
		System.out.println(account.getBalance());  // 100
		
		 account.deposit(300.0);
		System.out.println(account.getBalance());  // 400
		
		System.out.println(account.withdraw(-900));  // false
		
		System.out.println(account.withdraw(100));  // true

		System.out.println(account.getBalance());  // 300
  // Bank Code
	}
}
