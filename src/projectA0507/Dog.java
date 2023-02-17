package projectA0507;
// superclass에 animal 선택하고 생성하면 sound 자동으로 생성되어있음
public class Dog extends Animal {

	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}

}
