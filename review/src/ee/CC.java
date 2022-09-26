package ee;

import java.util.Calendar;

public class CC {
	public static void main(String[] args) {
		Calendar a = Calendar.getInstance();
		
		int year = 1996;
		int year1 = a.get(Calendar.YEAR);
		int age = year1 - year+1;

		
		System.out.println("나이는 : " + age );
		System.out.println("생년은 : " + year);
		
	}

}
