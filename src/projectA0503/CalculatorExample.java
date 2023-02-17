package projectA0503;

public class CalculatorExample {

	public static void main(String[] args) {
		// static을 썼으므로 class를 instance화 하지 않고 바로 선언
		double result1 = 10*10*Calculator.PI;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);

	}

}
