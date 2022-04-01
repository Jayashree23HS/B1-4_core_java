package inheritance;

class r6{
	void print() {
		System.out.println("i like r6");
	}
}
class r3 extends r6{
	void display() {
		System.out.println("i like r3");
	}
}
class r15 extends r3{
	void assign() {
		System.out.println("i like r15");
	}
}



public class multilevel {

	public static void main(String[] args) {
		r15 r=new r15();
		r.display();
		r.assign();
		r.print();

	}

}
