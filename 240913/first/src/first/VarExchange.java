package first;

public class VarExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 10;
		int var2 = 20;
		int temp;
		
		System.out.println("var1 : "+ var1+" var2 : "+var2);
		temp = var1;
		var1 = var2;
		var2 = temp;
		
		System.out.println("var1 : "+ var1+ " var2 : "+var2);
	}

}
