package animals;

public class Animal {
	public String name;
	public int legs;
	
	Animal(String n, int l) {
		name = n;
		legs = l;
	}
	
	public int getLegs() {
		return legs;
	}
}
