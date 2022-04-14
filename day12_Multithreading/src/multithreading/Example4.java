package multithreading;

public class Example4 {
	
	class Test extends Thread
	{
	    public void run ()
	    {
	        System.out.println ("thread is running...") ;
	    }
	class Main
	{
	    public void main(String args[]) {
	        Test create=new Test (); //Object creation
	        create.start();
}
	    }
}


}
