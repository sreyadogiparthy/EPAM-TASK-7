package structural_adapter;

import org.apache.log4j.Logger;

public class HpUsCharger implements UsCharger {

	public String fitsWhat() {
		Logger log = ILogger.getLogger();
		log.debug("Fits with an US port");
		return "US";
	}
	
}