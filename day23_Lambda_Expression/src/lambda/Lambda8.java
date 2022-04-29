package lambda;

public class Lambda8 {

	public static void main(String[] args) {
		//thread example with lambda expression
		Runnable r1=()->
		{
			System.out.println("class name is: Lamda8");
		};
		Thread t=new Thread(r1);
		t.start();

	}

}
