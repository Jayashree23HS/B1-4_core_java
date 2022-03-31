package oops;

public class car1 {
	String str;
	car1(String s)
	{
		str=s;
	}
		void print()
		{
			System.out.println("This is "+str);
		}
		
	

	public static void main(String[] args) {
		car1 a=new car1("Audi");
		car1 c=new car1("Merceded Beng");
		car1 c1=new car1("BMW");
		a.print();
		c.print();
		c1.print();

	}

}
