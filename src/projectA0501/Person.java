package projectA0501;

public class Person {
	// final은 초기값 지정하지 않을경우 값이 변경 가능하지만 초기값 지정하면 상수로서 그 값을 가지므로 변경 불가
	final String nation = "Korea";
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	// main치고 ctrl+space로 main method 삽입가능
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.name = "을지문덕";
//		p1.nation = "미국";
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
	}
}
