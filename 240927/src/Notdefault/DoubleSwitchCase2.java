package Notdefault;

public class DoubleSwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'b';
		
		switch(grade) {
			case 'A','a' ->{
				System.out.println("우수 회원입니다.");	
			}
			case 'B','b' ->{
				System.out.println("일반 회원입니다.");
				break;
			}
			default ->{
				System.out.println("손님입니다.");
			}
		}
	}

}
