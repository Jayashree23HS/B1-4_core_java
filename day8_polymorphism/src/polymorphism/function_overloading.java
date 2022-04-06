package polymorphism;

public class function_overloading {
	void assign(int a) {
		System.out.println("area of square: "+(a*a));
	}
	void assign(int a,int b) {
		System.out.println("area of rectangle: "+(a*b));
	}

	public static void main(String[] args) {
		function_overloading o=new function_overloading();
		o.assign(5);
		o.assign(10,20);
		// TODO Auto-generated method stub

	}

}
