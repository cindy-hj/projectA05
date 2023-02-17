package projectA05;

public class Computer {
	// 배열을 사용
	int sum1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum = sum + values[i];
		}
		return sum;
	}
	
	// 파라미터의 갯수가 무한대
	int sum2(int ...values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum = sum + values[i];
		}
		return sum;
	}
	
}
