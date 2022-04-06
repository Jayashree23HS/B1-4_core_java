package Abstract;


	class A{
		String name="john";
	}
	class B extends A{
		String name="johnny";
		void print()
		{
			System.out.println("hi, i am "+name);
			System.out.println("hi, i am "+super.name);
		}
	}
	public class example3 {

	public static void main(String[] args) {
		B b=new B();
		b.print();
		// TODO Auto-generated method stub

	}

}
