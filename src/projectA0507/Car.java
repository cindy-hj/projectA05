package projectA0507;

public class Car {
	// getter 값을 읽어올때
	// setter 값을 설정할때
	// 필드
	private int speed;
	private boolean stop;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	// 생성자
	
	// 메소드
//	public int getSpeed() {
//		return speed;
//	}
//	public void setSpeed(int speed) {
//		if(speed < 0) {
//			this.speed = 0;
//			return;
//		} else {
//			this.speed = speed;
//		}
//	}
}
