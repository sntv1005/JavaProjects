package datastructures;

import java.util.Scanner;

public class Branch extends Bank {

	public Branch(String firstName, String lastName, double accountNumber, String address, double amountCredited,
			double amountDebited) {
		super(firstName, lastName, address, accountNumber, address, amountCredited, amountDebited, amountDebited);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Bank b1= new Bank("Srinatha", "v", "Srinatha v", 31712412983.00, "malur", 45000.46, 163537.83, AccountNumber);
		System.out.println("Welcome : "+b1.Name);
		System.out.println("the account number of user is : "+b1.getAccountNumber());
		System.out.println("total amount in your account is : "+b1.getAmount());
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter amount to credit in account :");
	    double AmountCredit=sc.nextDouble();
	    System.out.println("amountcredited is :"+AmountCredit);
	    double totalAmount = b1.TotalAmount();
	    System.out.println(totalAmount);
	   
	    if(AmountCredit<totalAmount) {
	    	System.out.println("enter amount to debit from your account :");
	    	double Debit=sc.nextDouble();
	    	double amoundebited= AmountCredit-Debit;
	    	System.out.println("total amount after debiting RS. " +Debit+ "is :" +amoundebited);
	    }
	    else {
	    	System.out.println("insufficient balance ");
	    }
	    
	    
}

}
