package regex;

import java.util.regex.Pattern;

public class Example3 {

	public static void main(String[] args) 
	{
		String str="I1love3Mysore";
		String delimeter="\\d";
		
		Pattern p=Pattern.compile(delimeter,Pattern.CASE_INSENSITIVE);
		String[] res=p.split(str);
		
		for(String i:res)
		{
			System.out.println(i);
		}

	}

}
