package epam.task5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InterestCalculator {
	private double principle,rate,time;
	private static final Logger LOGGER=LogManager.getLogger(ConstructionCostCalculator.class);
	InterestCalculator(double principle,double rate,double time)
	{
		LOGGER.debug("Constructor invoked");
		this.principle=principle;
		this.rate=rate;
		this.time=time;
	}
	double simpleInterestCalculator()
	{
		LOGGER.debug("Calculated simple interest");
		return (principle*rate*time)/100;
	}
	double compoundInterestCalculator()
	{	
		LOGGER.debug("Calculated compound interest");
		return principle * Math.pow(1.0+rate/100.0,time) - principle;
	}
}
