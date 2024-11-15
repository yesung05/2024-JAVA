package review;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		//객체를 2개 만들지 않고 하나의 객체의 모양을 바꿔가며 하려고?
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc.setMute(true);
		rc.setMute(false);
	}
	
}
