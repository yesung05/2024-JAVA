package pak2;

public class AExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.SubB b = new  A.SubB();
		System.out.println(b.field1);
		b.method1();
		
		System.out.println(A.SubB.field2);
		A.SubB.method2();
	}

}
