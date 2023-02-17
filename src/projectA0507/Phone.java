package projectA0507;

public abstract class Phone {
	public String owner;
	
	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰전원을 켭니다.");
	}
	
	public void callPhone() {
		System.out.println("전화하기");
	}
	
	// 현재에는 음악듣는 기능 없지만 향후에 추가 될때 사용할것이다
	abstract void musicPhone();
	
	public void turnOff() {
		System.out.println("폰전원을 끕니다.");
	}
}
