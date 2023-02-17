package projectA0503;

public class Calculator {
	// 생성자를 선언하지 않았으므로 default 생성자가 호출됨
	// static은 instance화 하지 않고 바로 접근 가능
	static double PI = 3.14159;
	
	static int plus(int x, int y) {
		return x+y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
}
