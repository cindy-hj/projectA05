package projectA0501;

public class Calulator {
	// 필드
	// 생성자
	// 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = this.plus(x, y);
		double result = sum/2;
		return result;
	}
	
	void execute() {
		double result = this.avg(7,10);
		// class 내부에 있는 메소드 호출할때 this 생략 가능하지만 쓰는것이 낫다
        // 메소드 내에서는 파라미터가 우선순위가 높으므로
		this.println("실행결과: "+result);
        // result는 지역변수이므로 this 쓸 필요 없음
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
