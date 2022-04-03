package jumping;

public class Continue {
public static void main(String[] args)
	 {
		for(int i=0;i<10;i++) {
			if(i==6) {
				System.out.println();
				continue;
			}
			System.out.println(i);
		}
	}

}
