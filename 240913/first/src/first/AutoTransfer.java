package first;

public class AutoTransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteVal = 10;
		int intVal = byteVal;
		System.out.println("intVal : " + byteVal);
		
		char charVal = '가';
		intVal = charVal;
		System.out.println("intVal : " + byteVal);
		
		intVal = 50;
		long longVal = intVal;
		System.out.println("longVal : " + longVal);
		
		longVal = 100;
		float floatVal = longVal;
		System.out.println("floatVal : " + floatVal);
		
		floatVal = 100.5F;
		double doubleVal = floatVal;
		System.out.println("doubleVal : " + doubleVal);
	}

}