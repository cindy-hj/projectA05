package projectA0503;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}

	Car(String model) {
		// this는 생성자를 호출하는데 파라미터 3개가 가지고 있는 생성자에 this로 instance변수 지정했으므로 
		// 파라미터 하나 있는 생성자에서 this를 호출해도 파라미터 3개를 가지고 있는 생성자가 호출되는것
		// 여기서는 this로 값을 할당해준게 아니라 호출만 했잖아...! 메소드로 쓴것
		this(model, null, 0);
	}
	
	Car(String model, String color) {
		this(model, color, 0);
	}
	// this 이용 할때 위와 같이 사용 가능
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
