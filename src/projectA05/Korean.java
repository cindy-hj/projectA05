package projectA05;

public class Korean {
	// 필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 파라미터 이름은 줄이지 말고 그대로 쓰는게 좋다
	public Korean(String name, String ssn) {
		// this를 안붙이면 파라미터 값을 나타냄
		this.name = name;
		this.ssn = ssn;
	}
}
