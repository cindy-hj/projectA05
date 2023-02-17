package projectA0507;

public class Sparrow extends Animal {

	public Sparrow() {
		this.kind = "조류";
	}

	@Override // Add unimplemented method 클릭
	public void sound() {
		System.out.println("짹짹");
	}
		
}
