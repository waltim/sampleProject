package unb.cic.les;

public class Bird extends Animal{

	@Override
	public void animalEat() {
		System.out.println("The Bird is eating birdseed...");
	}
	
	@Override
	public void animalSound() {
		System.out.println("The Bird is flying in the sky..");
	}
}
