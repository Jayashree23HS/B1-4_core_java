package enum1;
enum Bike
{
	KTM,Duke,R3,R15, Pulser 
}

public class Example3 {

	public static void main(String[] args) {
		
		//Bike b=Bike.R15;
		Bike b;
		b=Bike.Pulser;
		switch(b)
		{
		case KTM:
			System.out.println("you choose KTM");
			break;
		case Duke:
			System.out.println("you choose Duke");
			break;
		case R3:
			System.out.println("you choose R3");
			break;
		case R15:
			System.out.println("you choose R15");
			break;
			default:
				System.out.println("invalid name");
				
		}


	}

}
