package framework;

public abstract class SavingAcc extends BankAcc
{
	private  boolean isSalaried;
	static final private float MINBAL = 500;
	
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried)
	{
		super(accNo,accNm,accBal);
		this.isSalaried=isSalaried;
		
	}
	
	public void withdraw(float accBal) {
		System.out.println("Account no: "+this.getAccNo()+"\n "+" Account name: "+this.getAccNm()+ "\n  "+"Account Balance: "+accBal);
	}


	

	@Override
	public String toString() {
		return String.format("SavingAcc [isSalaried=%s, toString()=%s]", isSalaried,
				super.toString());
	}
	

}
