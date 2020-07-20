package creational_factory;

public class IceCreamFactory {
	public IceCream getIceCream(String spec) {
		if (spec.equalsIgnoreCase("black current")) {
			return new BlackCurrent();
		} else if (spec.equalsIgnoreCase("vanila")) {
			return new Vanila();
		} else if (spec.equalsIgnoreCase("strawberry")) {
			return new Strawberry();
		}
		return null;
	}
}