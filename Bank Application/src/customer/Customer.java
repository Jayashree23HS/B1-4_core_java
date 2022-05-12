package customer;

import application.MMBankFactory;
import application.MMCurrentAcc;
import application.MMSavingAcc;
import framework.BankFactory;
import framework.CurrentAcc;
import framework.SavingAcc;

public class Customer {

	public static void main(String[] args) {
		BankFactory b=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(1010, "abc", 2000, true);
		CurrentAcc c=new MMCurrentAcc(2020, "xyz", 1000, 5000);
		System.out.println("Saving Account: ");
		s.withdraw(s.getAccBal());
		System.out.println();
		System.out.println("Current Account: ");
		c.withdraw(c.getAccBal());
		
		System.out.println(b.getNewSavingAccount(10, "aaa", 30, true));
		System.out.println(b.getNewCurrentAccount(20, "bbb", 50, 40));
		
		
		System.out.println(s);
		System.out.println();
		System.out.println(c);

	}

}
