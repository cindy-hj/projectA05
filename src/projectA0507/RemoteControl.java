package projectA0507;

// interface는 상속을 하는게 아니라 구현을 함
// class는 하나만 상속되므로 다중 상속의 효과를 내기 위해서 interface 사용
public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드 -> 공통적으로 쓰이는것
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	 // 정적 메소드 -> 독자적으로 쓰이는것
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
