package Task_6.Design_patterns;

import junit.framework.TestCase;
import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Test;

import structural_decorator.BlackPant;
import structural_decorator.ILogger;
import structural_decorator.Person;
import structural_decorator.WhiteShirt;

public class DecoratorTest {

	@Test
	public void decoratorTest1() {
		Person ask = new Person("ask");
		ask = new WhiteShirt(ask);
		ask = new BlackPant(ask);
		Logger log = ILogger.getLogger();
		log.debug(ask.getOutfits());

		assertEquals("ask, with Shirt, with Black pant", ask.getOutfits());

		Person sai = new Person();
		sai = new BlackPant(sai);
		log.debug(sai.getOutfits());

		assertEquals("none, with Black pant", sai.getOutfits());
	}

}