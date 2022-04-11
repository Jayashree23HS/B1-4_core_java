package interface1;

class Main implements Example1
{
	public void display()
	{
		System.out.println("hello everyone");
	}
	public static void main(String args[]) {
		Main m=new Main();
		m.display();
	}
}
