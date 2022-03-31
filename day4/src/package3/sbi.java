package package3;

public class sbi
{
	public int balance;
	public sbi(int bal)
	{
		balance=bal;
	}
	
	public void display()
	{
		System.out.println(balance);
	}
	public static void main(String[] args) {
	sbi s=new sbi(50800);
	s.display();
	
	}

}
