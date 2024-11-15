package review;
import java.util.Scanner;

public class giveScore {

	public static void main(String[] args) {
		Grade grd = new Grade();
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력해주세요:");
		int score = sc.nextInt();
		String gd = grd.getGrade(score);
		
		System.out.printf("당신의 등급은  %s 입니다.", gd);
		sc.close();
	}

}
