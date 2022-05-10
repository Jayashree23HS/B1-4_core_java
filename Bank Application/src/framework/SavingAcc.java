package framework;

public abstract class SavingAcc extends BankAcc
{
	private static boolean isSalaried;
	private static final float MINBAL = 0;
	
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried)
	{
		super(accNo,accNm,accBal);
		SavingAcc.isSalaried=isSalaried;
		
	}
	public void withdraw(float accBal)
	{
		
	}
	@Override
	public String toString() {
		return String.format("SavingAcc []");
	}
	
	
	
	
	

}
