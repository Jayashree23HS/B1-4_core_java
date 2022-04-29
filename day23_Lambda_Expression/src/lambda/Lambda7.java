package lambda;



public class Lambda7 {

	public static void main(String[] args) {
		//thread example without lambda expression
		Runnable R1=new Runnable()
				{
			@Override
			public void run()
			{
				System.out.println("class name is: Lamda7");
			}
				};
				
				Thread t=new Thread(R1);
				t.start();

	}

}
