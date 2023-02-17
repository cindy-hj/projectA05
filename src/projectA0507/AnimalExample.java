package projectA0507;

public class AnimalExample {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		Sparrow sparrow = new Sparrow();
		
		cat.sound();
		dog.sound();
		sparrow.sound();
		System.out.println("________________");
		
		Animal animal;
		
		animal = new Cat();
		animal.sound();
		animal = new Dog();
		animal.sound();
		animal = new Sparrow();
		animal.sound();
		
	}

}
