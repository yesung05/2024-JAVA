
public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A';
		
		if((65<= charCode) & (charCode<=90))
			System.out.println("대문자이군요");
		if((97<= charCode) && (charCode<=122))
			System.out.println("대문자이군요");
		if((48<= charCode) && (charCode<=57))
			System.out.println("대문자이군요");
		
		int value = 6;
		
		if((value%2==0) | (value%3==0))
			System.out.println("2또는 3의 배수이군요.");
		
		boolean result = ((value%2==0) || (value%3 == 0));
		if(!result) System.out.println("2또는 3의 배수가 아니군요.");
		
		System.out.println(~8);
	}
	

}
