package Notdefault;
import java.util.Scanner;
public class whileJjiksin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int iRandnum = (int)(Math.random()*10)+1;
		boolean bAnwser = false;
		int count = 0;
		while(!bAnwser) {
			
			
			
			System.out.println("1에서 10 사이중 하나를 입력하세요.");
			int iTempAns = sc.nextInt();
			
			if (iTempAns == iRandnum) {
				System.out.println("정답!");
				break;
			}
			
			else if(iTempAns > iRandnum) {
				System.out.println("Down!");
			}
			
			else if(iTempAns < iRandnum) {
				System.out.println("Up!");
			}
			count++;
			
			if(count>=3) {
				System.out.println("기회 끝");
				break;
			}
			
		}
	}

}