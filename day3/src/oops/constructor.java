package oops;

public class constructor {

	
		String str;
		int a;
		constructor()
		{
			str="welcome";
			a=123;
		}
		void display()
		{
			System.out.println(str+" "+a);
		}
		public static void main(String[] args)
		{
			constructor c=new constructor();
			c.display();
	}

}
