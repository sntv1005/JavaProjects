package datastructures;

import java.util.Scanner;

public class Bank {
	String FirstName;
	String LastName;
	String Name= FirstName+ LastName;
	double AccountNumber;
	String Address;
	double AmountCredited;
	double AmountDebited;
	double Amount=0 +AmountCredited;
	
	
	
	
	 public Bank(String firstName, String lastName , double accountNumber, String address,
				double amountCredited, double amountDebited, double amount) {
			super();
			FirstName = firstName;
			LastName = lastName;
			
			AccountNumber = accountNumber;
			Address = address;
			AmountCredited = amountCredited;
			AmountDebited = amountDebited;
			Amount = amount;
		}

	public void setName(String name) {
		Name = name;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public double TotalAmount() {
		return AmountCredited;
	

		
	}
	
	public double getAmountCredited() {
		return AmountCredited;
	}
	public void setAmountCredited(double amountCredited) {
		AmountCredited = amountCredited;
	}
	public double getAmountDebited() {
		return AmountDebited;
	}
	public void setAmountDebited(double amountDebited) {
		AmountDebited = amountDebited;
	}
	public double getAmount() {
		return Amount;
	}
	



	public double getAccountNumber() {
		return AccountNumber;
	}


	public void setAccountNumber(double accountNumber) {
		AccountNumber = accountNumber;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getName() {
		return Name;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	
		
		public static void main(String[] args) {
			Bank b1= new Bank("Srinatha", "v", 31712412983.00, "malur", 45000.46, 163537.83,0);
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

   

