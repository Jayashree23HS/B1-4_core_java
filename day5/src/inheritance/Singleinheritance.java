package inheritance;

	class Parent
	{
		void print()
		{
			System.out.println("Hello,This is johnn");
		}
	}
	class Child extends Parent
	{
		void display()
		{
			System.out.println("single1");
		}
	}
	class Singleinheritance
	{

		public static void main(String[] args)
		{
			Child c=new Child();
			c.display();
			c.print();

		}

	}
