
public class OvernUnderflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125;
		byte var2 = -125;
		
		for (int i = 0 ; i<5 ; i++) {
			var1++;	System.out.println("var1 : " + var1);
		}
		System.out.println("--------------------");
	
		for (int i = 0 ; i<5 ; i++) {
			var2--; System.out.println("var2 : " + var2);
		}
	}
}
