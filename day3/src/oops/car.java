package oops;

public class car {
	String str;
	car(String s)
	{
		str=s;
	}
		void print()
		{
			System.out.println("This is "+str);
		}
		
	

	public static void main(String[] args) {
		car a=new car("Audi");
		car c=new car("Merceded Beng");
		car c1=new car("BMW");
		a.print();
		c.print();
		c1.print();

	}

}
