package javapak;
import java.util.Scanner;

public class Review3 {
	public static void main(String[] args) {
		int[] iTwoNumAry = new int[2];
		String giho = "";
		Scanner sc = new Scanner(System.in);

		boolean run = true;
		while(run) {
			String sTemp = sc.nextLine();
			if (!sTemp.equals("q")) {
				iTwoNumAry[0] = Integer.parseInt(sTemp);
			} else {
				run = false;
				System.out.println("종료합니다.");
				break;
			}

			giho = sc.nextLine();
			iTwoNumAry[1] = Integer.parseInt(sc.nextLine());
			switch(giho) {
				case "+":
					System.out.println("두 수의 합은: " + add(iTwoNumAry));
					break;
				case "*":
					System.out.println("두 수의 곱은: " + multi(iTwoNumAry));
					break;
				case "-":
					System.out.println("두 수의 차는: " + minus(iTwoNumAry));
					break;
				case "/":
					System.out.println("두 수의 나누기는: " + devision(iTwoNumAry));
					break;
				default:
					System.out.println("식이 잘못되었습니다.");
			}
		}
		
		sc.close();
		
	}
	static int add(int[] twoNum) {
		return twoNum[0]+twoNum[1];
	}
	static int multi(int[] twoNum) {
		return twoNum[0]*twoNum[1];
	}
	static int minus(int[] twoNum) {
		return twoNum[0]-twoNum[1];
	}
	static double devision(int[] twoNum) {
		return (double)twoNum[0]/twoNum[1];
	}
}
