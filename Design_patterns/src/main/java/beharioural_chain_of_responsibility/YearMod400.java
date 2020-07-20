package beharioural_chain_of_responsibility;

import org.apache.log4j.Logger;

public class YearMod400 extends Process {

	Process nextProcess;
	@Override
	public void setNext(Process nextProcess) {
		this.nextProcess = nextProcess;
	}

	@Override
	public boolean process(int year) {
		
		Logger log = ILogger.getLogger();
		if(year%400 == 0) {
			log.debug("In YearMod400 process");
			log.debug("Year is leap");
			return true;
		}else {
			return nextProcess.process(year);
		}
	}

}