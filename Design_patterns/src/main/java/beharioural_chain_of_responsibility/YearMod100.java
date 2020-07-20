package beharioural_chain_of_responsibility;

import org.apache.log4j.Logger;
public class YearMod100 extends Process{
	Process nextProcess;
	@Override
	public void setNext(Process nextProcess) {
		this.nextProcess = nextProcess;
	}

	@Override
	public boolean process(int year) {
		Logger log = ILogger.getLogger();
		if(year % 100 == 0) {
			log.debug("In YearMod100 process");
			log.debug("Year is not a leap year");
			return false;
		}else {
			return nextProcess.process(year);
		}
	}
	
}