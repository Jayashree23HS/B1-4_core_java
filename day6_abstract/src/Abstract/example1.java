package Abstract;

abstract class animal{
	abstract void eat();
}
class herbivorous extends animal{
	void eat() {
		System.out.println("i am vegitarian");
	}
}
class carnivorous extends animal{
	void eat() {
		System.out.println("i am non vegitarian");
	}
}

public class example1 {

	public static void main(String[] args) {
		herbivorous h=new herbivorous();
		carnivorous c=new carnivorous();
		h.eat();
		c.eat();

	}

}
