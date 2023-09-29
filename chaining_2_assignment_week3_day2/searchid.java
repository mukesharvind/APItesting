package chaining_2_assignment_week3_day2;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class searchid extends BaseClass{

	@Test(dependsOnMethods = ("chaining_2_assignment_week3_day2.DeleteJiraId.deleteid"))
	public void search() {
		//getresponse
		  response=input.get("/"+incidentid);
		if (response.equals(incidentid)) {
			System.out.println("Incident id found");
		}
		else {
			System.out.println("Incident id deleted");
		}
	System.out.println("The status code is "+response.getStatusCode());
	}
}
