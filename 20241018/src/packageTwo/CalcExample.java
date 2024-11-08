package packageTwo;

public class CalcExample {

	public static void main(String[] args) {
		Carculator mycalc = new Carculator();
		mycalc.powerOn();
		
		int result1 = mycalc.plus(5, 6);
		System.out.printf("%d\n",result1);
		
		int x =10;
		int y = 4;
		
		double result2 = mycalc.divide(x,y);
		System.out.printf("%f\n", result2);
		
		mycalc.powerOff();

	}

}
