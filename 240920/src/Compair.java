
public class Compair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 10;
		
		boolean res1 = (num1 == num2);
		boolean res2 = (num1 != num2);
		boolean res3 = (num1<=num2);
		System.out.println("res1 : " + res1);
		System.out.println("res2 : " + res2);
		System.out.println("res3 : " + res3);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean res4 = (char1<char2);
		System.out.println("res4 : " + res4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean res5 = (num3 == num4);
		System.out.println("res5 : " +res5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean res6 = (num5 == num6);
		boolean res7 = (num5 == (float)num6);
		System.out.println("res6 : " + res6);
		System.out.println("res7 : " + res7);
		
		String str1 = "자바";
		String str2 = "Java";
		
		
	}

}
