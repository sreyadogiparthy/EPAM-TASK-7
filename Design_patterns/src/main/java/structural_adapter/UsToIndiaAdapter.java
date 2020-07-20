package structural_adapter;

import org.apache.log4j.Logger;

public class UsToIndiaAdapter implements IndianCharger {

	UsCharger usCharger;
	public UsToIndiaAdapter(UsCharger us){
		usCharger = us;
	}
	
	public String fitsWhat() {
		Logger log = ILogger.getLogger();
		log.debug("Fits with an Indian port");
		return "Indian";
	}
	
}
