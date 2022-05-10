package framework;

public abstract class CurrentAcc extends BankAcc
{
	private static float creditLimit;
	
	public CurrentAcc(int accNo, String accNm,float creditLimit, float accBal)
	{
		super(accNo,accNm,accBal);
		CurrentAcc.creditLimit=creditLimit;
	}
	public void withdraw(float creditLimit)
	{
		
	}
	@Override
	public String toString() {
		return String.format("CurrentAcc []");
	}
	

}
