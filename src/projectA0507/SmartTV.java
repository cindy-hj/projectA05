package projectA0507;

public class SmartTV implements RemoteControl, Searchable{
	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url+"을 겁색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		
	}

}
