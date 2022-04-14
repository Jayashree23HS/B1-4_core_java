package strings;
import java.util.StringTokenizer;

public class Example7 {

	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("lets try this");
		System.out.println(st.nextToken());
		System.out.println(st.nextToken());
	}

}
