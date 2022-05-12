package framework;

public abstract class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
	static final private float deliveryCharges=0.0f;
	public PrimeAcc(int accNo, String accNm, float charges,boolean isPrime) {
		super(accNo, accNm, charges);
        this.isPrime=isPrime;
	}
	public void bookProduct(float charges) {
		System.out.println("Account no: "+this.getAccNo()+"\n "+" Account name: "+this.getAccNm()+ "\n  "+"charge: "+charges);
		
	}
	@Override
	public String toString() {
		return String.format("PrimeAcc [isPrime=%s, toString()=%s]", isPrime,
				super.toString());
	}
	
	
	


}
