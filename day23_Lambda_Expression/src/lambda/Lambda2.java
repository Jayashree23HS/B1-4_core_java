package lambda;

interface A1
{
	void show(int i);
}

public class Lambda2 {

	public static void main(String[] args) {
		A1 obj=(int i)->
		{
			
				System.out.println("welcome to lambda expression " +i);
			
		};
		obj.show(5);
		// TODO Auto-generated method stub

	}

}
