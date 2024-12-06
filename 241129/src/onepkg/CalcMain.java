package onepkg;
import java.util.Scanner;

public class CalcMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		String[] sUserInput = new String[3];
		int[] iNumAry = new int[2];
		Scanner sc = new Scanner(System.in);
		System.out.println("연산 식을 엔터로 구분하여 입력하세요.");
		boolean[] bUserInput = {false, false, false};
		int spinary = 0;
		while(!(bUserInput[0] && bUserInput[1] && bUserInput[2])) {
			if(spinary != 1) {
				if(!bUserInput[spinary]) {
					System.out.printf("%d 번째 숫자를 입력하세요: ",spinary);
					sUserInput[spinary] = sc.nextLine();
					if(sUserInput[spinary].equals("q")) {
						System.out.println("종료합니다.");
						return;
					}
					if(!sUserInput[spinary].isEmpty() && isInteger(sUserInput[spinary])) {
						if(spinary>=2) {
							iNumAry[spinary-1] = Integer.parseInt(sUserInput[spinary]);
							bUserInput[spinary] = true;
						} else {
							iNumAry[spinary] = Integer.parseInt(sUserInput[spinary]);
							bUserInput[spinary] = true;
						}
						
					} else {
						continue;
					}
				}
			} else {
				System.out.print("연산 기호를 입력하세요: ");
				sUserInput[spinary] = sc.nextLine();
				bUserInput[spinary] = true;
			}

			spinary++;
		}
		for(int i = 0 ; i<3; i++) {
			System.out.printf("%s ",sUserInput[i]);
		}
		switch(sUserInput[1]) {
		case "+":
			System.out.println(calc.add(iNumAry));
			break;
		case "-":
			System.out.println(calc.minus(iNumAry));
			break;
		case "*":
			System.out.println(calc.multi(iNumAry));
			break;
		case "/":
			System.out.println(calc.devision(iNumAry));
			break;
		default:
			System.out.println("잘못된 연산식입니다.");
		}
		sc.close();
	}
	  public static boolean isInteger(String strValue) {
		    try {
		      Integer.parseInt(strValue);
		      return true;
		    } catch (NumberFormatException ex) {
		      return false;
		    }
		  }
}
