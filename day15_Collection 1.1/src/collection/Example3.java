package collection;


import java.util.LinkedList;

public class Example3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList obj=new LinkedList<>();
		obj.add(10);
		obj.add("jonny");
		obj.add(2.0);
		obj.add(9);
		System.out.println(obj);
		obj.addFirst(5);
		obj.addLast(25);
		System.out.println(obj);
		System.out.println(obj.size());
		@SuppressWarnings("rawtypes")
		LinkedList obj1=new LinkedList<>();
		obj1.add("joe");
		obj1.add("john");
		obj1.add("jesh");
		obj.addAll(2,obj1);
		System.out.println(obj);
		


		// TODO Auto-generated method stub

	}

}
