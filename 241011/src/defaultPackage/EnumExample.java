package defaultPackage;

import java.util.Calendar;

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch(week) {
			case 1: today = Week.SUNDAY; break;
			case 2: today = Week.MONDAY; break;
			case 3: today = Week.TUESDAY; break;
			case 4: today = Week.WEDNESDAY; break;
			case 5: today = Week.THURSDAY; break;
			case 6: today = Week.FRIDAY; break;
			case 7: today = Week.SATURDAY; break;
			
		}
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다." +Week.SUNDAY);
		} else {
			System.out.println("열심히 자바 공부합니다." + Week.SUNDAY + "--" + today);
		}
	}

}
