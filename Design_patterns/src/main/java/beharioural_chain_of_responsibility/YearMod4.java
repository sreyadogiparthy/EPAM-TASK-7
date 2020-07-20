package beharioural_chain_of_responsibility;

import org.apache.log4j.Logger;

public class YearMod4 extends Process{
	Process nextProcess;
	@Override
	public void setNext(Process nextProcess) {
		this.nextProcess = nextProcess;
	}

	@Override
	public boolean process(int year) {
		Logger log = ILogger.getLogger();
		log.debug("In YearMod4 process");
		if(year % 4 == 0) {
			log.debug("Year is a leap year");
			return true;
		}else {
			log.debug("Year is not a leap year");
			return false;
		}
	}

}