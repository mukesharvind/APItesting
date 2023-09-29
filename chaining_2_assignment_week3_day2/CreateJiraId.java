package chaining_2_assignment_week3_day2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateJiraId extends BaseClass{

	@Test
	public void jiraidcreate() {
		
		//add request
		 input = RestAssured.given().contentType("application/json").given().body("{\r\n"
				+ "	\"fields\": {\r\n"
				+ "		\"project\": {\r\n"
				+ "			\"key\": \"M1\"\r\n"
				+ "		},\r\n"
				+ "		\"summary\": \"create issue in RA project\",\r\n"
				+ "		\"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "		\"issuetype\": {\r\n"
				+ "			\"name\": \"Bug\"\r\n"
				+ "		}\r\n"
				+ "	}\r\n"
				+ "}");
		
		 response = input.post();
		 
		
		//get the id
		 incidentid = response.jsonPath().get("id");
		 System.out.println("The incident id is "+incidentid);
		
		 //create code validation using assertion
		 System.out.println("The status code is "+response.getStatusCode());
		 response.then().assertThat().statusCode(201);
		 response.prettyPrint();
	}
}
