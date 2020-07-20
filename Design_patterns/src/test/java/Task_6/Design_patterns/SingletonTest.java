package Task_6.Design_patterns;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Test;

import creational_singleton.ILogger;

public class SingletonTest {

	@Test
	public void singletonTest1() {
		Logger log = ILogger.getLogger();
		
		log.debug("This is a test for singleton creational design patter");
		
		log.debug("Hash code of first retrieval : " + log.hashCode());
		Logger log1 = ILogger.getLogger();
		
		log.debug("Hash code of second retrieval : " + log1.hashCode());
		log.debug("Are two objects same ? " + (log == log1));
		assertEquals(log,log1);
	}
}