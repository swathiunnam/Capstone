package test;

import org.testng.annotations.Test;

import base.ProjectSpecification;
import pageobjects.OneWayTripPage;

public class OnewaytripTest extends ProjectSpecification{
	
	@Test
	   public void onewayTest ()throws InterruptedException  {
		
	    OneWayTripPage op=new OneWayTripPage(driver);
	 
	    op.clickDestination();
	    op.enterDestination();
	    op.clickDeparturedate();
	    op.selectTravelDate();
	    op.clickSearchFlight();
	   
	}
		

}
