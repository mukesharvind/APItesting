package chaining_2_assignment_week3_day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteJiraId extends BaseClass{

	@Test (dependsOnMethods = "chaining_2_assignment_week3_day2.UpdateJiraid.updatejira")
	public void deleteid() {
		//delete response
		response=RestAssured.delete("/"+incidentid);
		
		System.out.println("The status code is "+response.getStatusCode());
	}
}
