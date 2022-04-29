package lambda;

interface A
{
	void show();
}
/*class XYZ implements A
{
	public void show()
	{
		System.out.println("welcome to lambda expression");
	}
}*/

public class Lambda1 {

	public static void main(String[] args) {
		A obj=()->
		{
			
				System.out.println("welcome to lambda expression");
			
		};
		obj.show();
		
		// TODO Auto-generated method stub

	}

}
