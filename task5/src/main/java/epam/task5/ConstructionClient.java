package epam.task5;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionClient {
	private static final Logger LOGGER=LogManager.getLogger(ConstructionClient.class);
public static void main(String[] args)
	{
		LOGGER.debug("Entered ConstructionClient Main method");
		Scanner sc=new Scanner(System.in);
		float area;
		int standardchoice;
		LOGGER.info("Enter the area in square feet:");
		area=sc.nextFloat();
		LOGGER.info("Enter the material standard choice:\n1.Standard\n2.Above standard\n3.High standard\n"
							+ "4.High standard and fully automated home");
		standardchoice=sc.nextInt();
		if(standardchoice>0&&standardchoice<=4)
		{
			ConstructionCostCalculator cobj=new ConstructionCostCalculator(standardchoice,area);
			LOGGER.info("The construction cost is:"+cobj.costCalc()+" Rupees");
		}
		else
		{
			LOGGER.error("Invalid Choice");
		}
		sc.close();
		LOGGER.debug("Exiting ConstructionClient Main method");
	}
}
