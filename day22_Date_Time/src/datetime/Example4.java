package datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Example4 {

	public static void main(String[] args) {
		LocalDate date1=LocalDate.now();//27th date
		LocalDate date2=date1.plusDays(3);
		System.out.println(date2);
		long df=ChronoUnit.DAYS.between(date1, date2);
		//chronounit is he diff between 27 to next 3 days
		System.out.println(df);
		
		// TODO Auto-generated method stub

	}

}
