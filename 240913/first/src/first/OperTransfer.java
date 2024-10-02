package first;

public class OperTransfer {
	public static void main(String[] args) {
		byte res1 = 10+20;
		System.out.println(res1);
		
		byte v1 = 10;
		byte v2 =20;
		int res2 = v1+v2;
		System.out.println(res2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long res3 = v3+v4+v5;
		System.out.println(res3);
		
		char v6 = 'A';
		char v7 = 1;
		int res4 = v6+v7;
		System.out.println(res4);
		System.out.println((char)res4);
		
		int v8 = 10;
		int res5 = v8/4;
		System.out.println(res5);
		
		int v9 = 10;
		double res6 = v9/4.0;
		System.out.println(res6);
		
		int v10 = 1;
		int v11 = 2;
		double res7 = (double) v10/v11;
		System.out.println(res7);
		
		
		
	}
}
