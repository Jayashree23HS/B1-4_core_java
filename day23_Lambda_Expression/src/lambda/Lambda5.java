package lambda;

interface C
{
	String print(String message);
}

public class Lambda5 {

	public static void main(String[] args) {
		//lambda expression with return
		
		C obj=(String message)->
		{
			return message;
			//System.out.println("the name is "+message);
		};
		System.out.println("the name is: "+obj.print(" john"));
		}

}
