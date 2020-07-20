package Task_6.Design_patterns;

import junit.framework.TestCase;

import beharioural_chain_of_responsibility.YearMod100;
import beharioural_chain_of_responsibility.YearMod4;
import beharioural_chain_of_responsibility.YearMod400;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import beharioural_chain_of_responsibility.Process;

public class ChainOfResponsibilityTest {
	@Test
	public void chainOfResponsibilityTest1() {
		Process p1 = new YearMod400();
		Process p2 = new YearMod100();
		Process p3 = new YearMod4();

		p1.setNext(p2);
		p2.setNext(p3);

		assertTrue(p1.process(2016));
		assertFalse(p1.process(2017));
		assertFalse(p1.process(1700));
	}
}