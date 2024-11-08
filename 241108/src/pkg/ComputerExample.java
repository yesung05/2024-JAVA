package pkg;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Calculator calc = new Calculator();
		
		System.out.println("원면적 : "+ calc.areaCircle(r));
		System.out.println();
		
		Computer pc = new Computer();
		
		System.out.println("원면적 : "+ pc.areaCircle(r));
	}

}
