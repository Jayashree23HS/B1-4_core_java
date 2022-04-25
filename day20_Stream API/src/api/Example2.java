package api;

import java.util.Arrays;
import java.util.List;


public class Example2 {

	public static void main(String[] args) {
		List<Integer>values=Arrays.asList(11,22,33,5,6,8,88,22);
		values.stream().filter(i->i<10).forEach(i->System.out.println(i));
		values.stream().distinct().forEach(i->System.out.println("unique values are"+i));
		values.stream().limit(5).forEach(i->System.out.println(i));


		
		

	}

}
