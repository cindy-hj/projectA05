package projectA0501;

public class CarExample {

	public static void main(String[] args) {
		// class가 같은 패키지 내에 존재하면 import 안해도 읽어 올 수 있다
		Car myCar = new Car("검정", 3000);
		// default 생성자가 없으면 오류 발생
		Car myCar1 = new Car();

	}

}
