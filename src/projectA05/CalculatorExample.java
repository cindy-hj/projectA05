package projectA05;

public class CalculatorExample {

	public static void main(String[] args) {
		// default 생성자가 자동으로 추가 되기 때문에 동작하는것, Caculator에 생성자는 없고 method만 있기 때문에 가능
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: "+result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: "+result2);
		
		myCalc.powerOff();
	}

}
