package structural_decorator;

public class Person {
	String outfit = "none";

	public Person(String name) {
		outfit = name;
	}
	
	public Person() {
		
	}

	public String getOutfits() {
		return outfit;
	}
}