package behavioural_state;

import org.apache.log4j.Logger;

public class Rectangle implements Shape {

	public String draw() {
		Logger log = ILogger.getLogger();
		log.debug("Drawing Rectangle");
		return "Drawing Rectangle";
	}
}
