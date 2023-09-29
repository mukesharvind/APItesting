package chaining_2_assignment_week3_day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UpdateJiraid extends BaseClass{

	@Test(dependsOnMethods = "chaining_2_assignment_week3_day2.CreateJiraId.jiraidcreate")
	public void updatejira() {
		//add response
		input = RestAssured.given().contentType("application/json").when().body("{\r\n"
				+ "	\"fields\": {\r\n"
				+ "		\"description\": \"Bug creation Using REST API for testing\"\r\n"
				+ "	}\r\n"
				+ "}");
		//send Request
		 response = input.put("/"+incidentid);
		System.out.println("The status code is "+response.getStatusCode());
		
		response.then().assertThat().statusCode(204);
		response.prettyPrint();
		
	}
}
