
public class BitMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int res1 = num1 << 3;
		int res2 = num1 * (int) Math.pow(2, 3);
		System.out.println("res1" +res1);
		System.out.println("Res2 " +res2);
		
		int num2 = -8;
		int res3 = num2 >>3;
		int res4 = num2/(int)Math.pow(2, 3);
		System.out.println("res3" + res3 );
		System.out.println("res4" +res4 );
	}

}
