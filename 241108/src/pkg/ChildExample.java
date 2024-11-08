package pkg;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent par = new Child();
		
		par.field1 = "data1";
		par.method1();
		par.method2();
		
		Child child = (Child)par; //자료형 변환을 (int)변수명 하는것처럼
		
		child.field2 = "data2";
		child.method3();
	}

}
