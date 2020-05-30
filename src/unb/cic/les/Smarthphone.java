package unb.cic.les;

public class Smarthphone {

	int Number;
	String brand;

	public void call() {
		System.out.println("Calling to a friend.");
	}
	
	public int getNumber() {
		return Number;
	}

	public void setNumber(int number) {
		Number = number;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
