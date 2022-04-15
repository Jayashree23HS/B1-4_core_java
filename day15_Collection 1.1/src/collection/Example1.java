package collection;

import java.util.ArrayList;

public class Example1 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList<>();//we can declare array size in ()
		obj.add(10.0);
		obj.add("john");
		System.out.println(obj);

	}

}
