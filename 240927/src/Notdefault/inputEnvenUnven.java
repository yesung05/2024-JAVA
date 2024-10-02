package Notdefault;
import java.util.Scanner;

public class inputEnvenUnven {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int inum = scanner.nextInt();
		if(inum%2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
	}

}
