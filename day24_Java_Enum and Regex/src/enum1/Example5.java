package enum1;

public class Example5 
{
	enum Day
	{
		sunday,monday,tuesday,wednesday,thursday,friday,saturday
	}

	public static void main(String[] args) {
		Day d=Day.tuesday;
		printDisplay(d);
	}
		
		public static void printDisplay(Day d1){
		{
			if(d1==Day.friday)
			{
				System.out.println("same");
			}
			else
			{
				System.out.println("not same");
			}
		}
	}
}
