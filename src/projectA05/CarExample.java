package projectA05;

public class CarExample {

	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();
		
		// 캡슐로 감싸진걸 외부에 노출시키기 때문에 이렇게 잘 쓰지는 않음
		System.out.println("제작회사: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색깔: "+myCar.color);
		System.out.println("최고속도: "+myCar.maxSpeed);
		// 변수를 초기화 하지 않으니 0으로 지정됨
		System.out.println("현재속도: "+myCar.speed);

		myCar.speed = 60;
		System.out.println("수정된 속도: "+myCar.speed);

		
	}

}
