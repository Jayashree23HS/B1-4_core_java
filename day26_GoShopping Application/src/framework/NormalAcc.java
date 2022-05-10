package framework;

public abstract class NormalAcc extends ShopAcc
{
	private static float deliveryCharges;
	
	
	public NormalAcc(int accNo,String accNm,float deliveryCharges, float charges)
	{
		super(accNo,accNm,charges);
		NormalAcc.deliveryCharges=deliveryCharges;
	}
	public void bookProduct(float deliveryCharge)
	{
		
	}
	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharge=%s]", deliveryCharges);
	}

}
