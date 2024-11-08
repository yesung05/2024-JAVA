package packageTwo;

public class FuelExample {

	public static void main(String[] args) {
		Fuel car = new Fuel();
		
		car.setGas(10);
		
		if(car.isLeftGas()) {
			System.out.println("출발합니다.");
			
			car.run();
		}
		
		System.out.println("Gas를 주입하세요.");
		
		

	}

}
