package pkg;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane sps = new SupersonicAirplane();
		
		sps.takeOff();
		sps.fly();
		sps.flyMode = SupersonicAirplane.SUPERSONIC;
		sps.fly();
		sps.flyMode = SupersonicAirplane.NORMAL;
		sps.fly();
		sps.land();
	}

}
