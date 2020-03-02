package animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Dog extends Animal {
	
	Dog(String name, int legs) {
		super(name, legs);
	}
	public String toString() {
		return name + " " + legs;
	}
}
