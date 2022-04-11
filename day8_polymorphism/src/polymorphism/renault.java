package polymorphism;

public class renault {
	String color;
	int speed;
	renault()
	{
		System.out.println("i bought triber in 2021");
	}
	renault(String color,int speed)
	{
		this.color=color;
		this.speed=speed;
	}

	public static void main(String[] args) {
		renault r=new renault();
		renault r1=new renault("yellow",50);
		System.out.println(r1.color+" "+r1.speed);

	}

}
