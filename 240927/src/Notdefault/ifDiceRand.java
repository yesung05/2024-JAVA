package Notdefault;
import java.util.Scanner;
public class ifDiceRand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		int num = (int)(Math.random()*6)+1;
		int num = scanner.nextInt();
//		System.out.printf("%d 번이 나왔습니다.", num);
		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		}
		else if(num == 2) {
			System.out.println("2번이 나왔습니다.");
		}
		else if(num == 3) {
			System.out.println("3번이 나왔습니다.");
		}
		else if(num == 4) {
			System.out.println("4번이 나왔습니다.");
		}
		else if(num == 5) {
			System.out.println("5번이 나왔습니다.");
		}
		else {
			System.out.println("6번이 나왔습니다.");
		}
	}

}
