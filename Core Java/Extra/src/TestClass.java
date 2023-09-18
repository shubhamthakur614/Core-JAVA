import java.util.Calendar;
import java.util.Date;

public class TestClass {
	public static void main(String[] args) {
//		Calendar cal = Calendar.getInstance();
//		Date cd = cal.getTime(); // cd => current year
//		cal.add(Calendar.YEAR, 1);
//		Date ny = cal.getTime(); // ny => get next year
//		cal.add(Calendar.YEAR, -2);
//		Date py = cal.getTime(); // py => previous year
//		System.out.println("Current Date : " + cd);
//		System.out.println("Date Before One Year : " + py);
//		System.out.println("Date After One Year  : " + ny);
		
		Calendar cal1=Calendar.getInstance();
		cal1.add(Calendar.YEAR, -5);
		long timeInMillis = cal1.getTimeInMillis();
		cal1.add(Calendar.YEAR, 3);
		long timeInMillis2 = cal1.getTimeInMillis();
		System.out.println(timeInMillis);
		System.out.println(timeInMillis2);
		
	}
}
