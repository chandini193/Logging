package com.chandini.cleancode;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class App 

{
    private static final Logger LOGGER = LogManager.getLogger(App.class);
	public static void main( String[] args )
    {  
		
        Scanner in = new Scanner(System.in);
        String c = "Y";
    	while(c.equals("Y")){
    		LOGGER.info("Choose option:");
    		LOGGER.info("1.Calculate Interest  2.Estimate house construction cost");
    		LOGGER.info("Enter option:");
	        int option = in.nextInt();
	        if(option == 1){
	        	Interest interest = new Interest();
	        	LOGGER.info("Enter the principal amount:");
	        	double principlaAmount = in.nextDouble();
	        	LOGGER.info("Enter the annual rate of interest(in %):");
	        	double rateOfInterest = in.nextDouble();
	        	LOGGER.info("Enter the number of periods(time in years):");
	        	double time = in.nextDouble();
	        	LOGGER.info("1.Simple Interest 2. Compound Interest");
	        	LOGGER.info("Enter option:");
	            int choice = in.nextInt();
	            if(choice == 1){
	            	LOGGER.info("Simple Interest in rupess = "+ interest.simpleInterest(principlaAmount,rateOfInterest, time));
	            }
	            else if(choice == 2){
	            	LOGGER.info("Compound Interest in rupees = "+ interest.compoundInterest(principlaAmount,rateOfInterest, time));
	            }
	            else{
	            	LOGGER.info("Invalid Choice...!");
	            }
	        }
	        else if(option == 2){
	        	HouseConstructionCost houseConstructionCost = new HouseConstructionCost();
	        	LOGGER.info("Choose material standarad");
	        	LOGGER.info("1.Standard\n2.Above Standard\n3.High Standard\n4.High Standard + Fully Automated");
	        	LOGGER.info("Enter choice:");
	        	int standard = in.nextInt();
	        	LOGGER.info("Enter total area of house(in sqft):");
	        	int area = in.nextInt();
	        	LOGGER.info("Construcion cost = "+ houseConstructionCost.caluclateCost(standard, area));
	        }
	        else{
	        	LOGGER.info("Invalid Choice...!");
	        }
	        LOGGER.info("Do you want to continue[Y or N]? : ");
        	c = in.next().toUpperCase();
    	}
    	
		
	        
    }
}
