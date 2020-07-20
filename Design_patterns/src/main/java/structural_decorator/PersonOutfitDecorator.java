package structural_decorator;

public abstract class PersonOutfitDecorator extends Person {
	PersonOutfitDecorator(){
		super("None");
	}
	PersonOutfitDecorator(String name){
		super(name);
	}
	public abstract String getOutfits();
}