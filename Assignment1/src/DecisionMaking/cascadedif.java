package DecisionMaking;

public class cascadedif {

	public static void main(String[] args) {
		int x=20,y=30,z=10;
		if(x>y && x>z) {
			System.out.println("x is greater number");
		}
		else if(y>x && y>z) {
			System.out.println("y is greater number");
		}
		else {
			System.out.println("z is greater number");
		}

	}

}
