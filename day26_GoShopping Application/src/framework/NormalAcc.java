package framework;

public abstract class NormalAcc extends ShopAcc
{
	private final float deliveryCharges;

	public NormalAcc(int accNo, String accNm, float charges,float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges=deliveryCharges;
	}
	public void bookProduct(float charges) {
	
		System.out.println("Account no: "+this.getAccNo()+ "\n"+"   Account Name:  "+this.getAccNm()+ " \n "+"charge: "+  (charges+deliveryCharges));
	}
	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharges=%s, toString()=%s]",
				deliveryCharges, super.toString());
	}
	


}
