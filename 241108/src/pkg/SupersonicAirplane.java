package pkg;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행입니다.");
		} else { 
			super.fly();
		}
	}

}
