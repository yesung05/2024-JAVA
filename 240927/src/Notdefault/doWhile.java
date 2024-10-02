package Notdefault;
import java.util.Scanner;
public class doWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("메시지를 입력하세요.");
		System.out.println("종료하시려면 q를 입력하세요.");
		
		String inputString;
		do {
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		// TODO Auto-generated method stub

	}

}
