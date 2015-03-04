package animals;

public class Animal implements Mammals {
	public void eat(){
		System.out.println("Animal Eats");
	}
	public void move(){
		System.out.println("Animal move");
	}
	public int numberOfLegs(){
		return 4;
	}
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.move();
		System.out.println(animal.numberOfLegs());
	}
}