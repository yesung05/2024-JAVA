package example3;

public class Car {
	int speed;
	
	void run() {
		System.out.printf("%d로 달립니다.\n",speed);
	}
	
	static void simulate() {
//		this.speed = 10;
//		speed = 20;
		
		Car Mycar = new Car();
		
		Mycar.speed = 200;
		Mycar.run();
	}
	
	public static void main(String[] args) {
		simulate();
		
		Car myCar = new Car();
		
		myCar.speed = 60;
		myCar.run();
	}
}
