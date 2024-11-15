package review;

public class ExtendsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl;
		ia.methodA();
		
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		System.out.println();
		
		InterfaceC ic = impl;
		
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		
		
	}

}
