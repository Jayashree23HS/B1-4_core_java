package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example2 {

	public static void main(String[] args) {
		String datetime="2022-04-27 18:19";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); //month in capital M minutes in samll m
		LocalDateTime l=LocalDateTime.parse(datetime,df);
		System.out.println(l);
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
