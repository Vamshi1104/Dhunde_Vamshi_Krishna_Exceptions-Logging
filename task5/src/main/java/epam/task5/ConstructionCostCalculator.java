package epam.task5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCostCalculator {
	private static final Logger LOGGER=LogManager.getLogger(ConstructionCostCalculator.class);
	private int standardlevel;
	private float area;
	ConstructionCostCalculator(int standardlevel,float area)
	{
		LOGGER.debug("Constructor invoked");
		this.standardlevel=standardlevel;
		this.area=area;
	}
	double costCalc()
	{
		int arr[]=new int[]{1200,1500,1800,2500};
		LOGGER.debug("Calculated cost and exiting method costCalc()");
		return arr[standardlevel-1]*area;
	
	}
}
