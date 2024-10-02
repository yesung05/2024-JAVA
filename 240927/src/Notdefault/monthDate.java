package Notdefault;

public class monthDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randMonth = (int)(Math.random()*12)+1;
		int date = 0;
		
		switch(randMonth) {
			case 4, 6, 9, 11 -> {
				date = 30;
				break;
			}
			case 2 -> {
				date = 28;
				break;
			}
			default -> {
				date = 31;
			}
		}
		System.out.printf("%d월의 마지막 날은  %d일 입니다.", randMonth, date);
	}

}
