package projectA0507;

public class Aircon implements RemoteControl {
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("에어컨을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("에어컨을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("현재 에어컨 볼륨은 "+this.volume+"입니다.");

	}

}
