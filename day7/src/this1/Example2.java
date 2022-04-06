package this1;

public class Example2 {
	int a,b;
	void display(int a,int b)
	{
		a=a;
		b=b;
	}
	void print()
	{
		System.out.println("value of a: " +a);
		System.out.println("value of a: " +a);

	}

	public static void main(String[] args)
	{
		Example2 e=new Example2();
		e.display(10, 25);
		e.print();
		
	}

}
