package unb.cic.les;

public class Dog extends Animal{

	@Override
	public void animalEat() {
		System.out.println("The Dog is eating a meat...");
	}
	
	@Override
	public void animalSound() {
		System.out.println("The dog is running in garden..");
	}
	
}
