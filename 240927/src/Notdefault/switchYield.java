package Notdefault;

public class switchYield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade = "B";
		int score1 = 0;
		switch(grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			int result = 100-20;
			score1 = result; //왜 굳이?
			break;
		default:
			score1 =60;
		}
		System.out.println("score1 : " + score1);
		
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				int result = 100-20;
				yield result;
			}
			default -> 60;
		};
		
	}

}
