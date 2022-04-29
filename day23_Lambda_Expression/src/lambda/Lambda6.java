package lambda;

interface D
{
	int mul(int x,int y);
}

public class Lambda6 {

	public static void main(String[] args) {
		//lambda expression without return
		D obj=(x,y)->(x*y);
		System.out.println(obj.mul(2, 3));

	}

}
