package chap04;
import java.util.Scanner;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int iRandnum = (int)(Math.random()*20)+1;
		int iUserInput = 0;
		int iRepeatCount = 0;
		while(true) {
			iRepeatCount++;
			System.out.println("Input a number between 1 and 20.");
			iUserInput = scanner.nextInt();
			if(iUserInput == iRandnum) {
				System.out.println("Bingo!");
				break;
			}
			else if(iUserInput < iRandnum) {
				System.out.println("Up!");
			}
			else if(iUserInput > iRandnum) {
				System.out.println("Down!");
			}
		}
		System.out.printf("You passed the Quize, %d th try", iRepeatCount);
	}
//1st 2nd 3rd 4th ..
}
