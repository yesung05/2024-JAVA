
public class NaNnInfinity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		double y = 0.0;
		double z = x / y; //nan
		
		System.out.println(z+2); // Wrong Code
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("Cannot Calculate");
		}
		else {
			System.out.println(z+2);
		}
	}

}
