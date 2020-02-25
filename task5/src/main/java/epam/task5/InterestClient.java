package epam.task5;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InterestClient {
	private static final Logger LOGGER=LogManager.getLogger(ConstructionCostCalculator.class);
	public static void main(String[] args)
	{
		LOGGER.debug("Entered InterestClient main method");
		Scanner sc=new Scanner(System.in);
		int choice;
		double principle,rate,time;
		LOGGER.info("Enter principle:");
		principle=sc.nextDouble();
		LOGGER.info("Enter rate:");
		rate=sc.nextDouble();
		LOGGER.info("Enter time in years:");
		time=sc.nextInt();
		LOGGER.info("Enter the choice\n1.Simple Interest\n2.Compound Interest");
		choice=sc.nextInt();
		if(choice==1||choice==2)
		{
			
			InterestCalculator icobj=new InterestCalculator(principle,rate,time);
			LOGGER.info("The interest is:");
			if(choice==1)
				LOGGER.info(icobj.simpleInterestCalculator()+" Rupees");
			else
				LOGGER.info(icobj.compoundInterestCalculator()+" Rupees");
		}
		else
		{
			LOGGER.error("Invalid choice");
		}
		sc.close();
		
	}
}
