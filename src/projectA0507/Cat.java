package projectA0507;
// abstract 아님
public class Cat extends Animal {
	
	public Cat() {
		this.kind = "포유류";
	}
	
	// Cat 오류나서 클릭해보면...
	@Override // 재정의 하는것
	public void sound() {
		System.out.println("야옹!");
	}

}
