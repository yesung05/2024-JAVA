package defaultPackage;

public class MainArgsExample {

	public static void main(String[] args) { //사실상 String[] args는 배열(변수) 이잖아
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.print("프로그램 입력 값이 부족");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		
		System.out.println(num1 + " + " + num2 + " = " + result);
	}

}
