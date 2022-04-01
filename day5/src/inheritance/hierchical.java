package inheritance;

class cellphone
{
	void message() {
		System.out.println("hii,john");
	}
	void call() {
		System.out.println("i'm calling jonny");
	}
}
class samsung extends cellphone
{
	void facelock()
	{
		System.out.println("modern facelock");
	}
}
class oneplus extends cellphone
{
	void games()
	{
		System.out.println("pubg ");
	}
}





public class hierchical {

	public static void main(String[] args) {
		oneplus o=new oneplus();
		o.games();
		o.message();
		o.call();
		samsung m=new samsung();
		m.facelock();
		

	}

}
