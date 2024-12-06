package pak2;

public class A1 {
	String field = "A-field";
	
	void method() {
		System.out.println("A-method");
	}
	
	class B {
		String field = "B-field";
		
		void method() {
			System.out.println("B-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			
			System.out.println(A1.this.field);
			A1.this.method();
		}
	}
	void useB() {
		B b = new B();
		b.print();
	}
}
