
public class MathOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1+ v2;
		System.out.println("Result1: " + result1);
		
		long result2 = v1 + v2 - v4;
		System.out.println("Result2: " + result2);
		
		double result3 = (double)v1/ v2;
		System.out.println("Result3: " +result3);
		
		int result4 = v1 %v2;
		System.out.println("Result4: " +result4);
	}

}
