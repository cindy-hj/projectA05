package projectA0507;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		rc = new SmartTV();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		
		// rc로 접근 불가
		RemoteControl.changeBattery();
	}
}
