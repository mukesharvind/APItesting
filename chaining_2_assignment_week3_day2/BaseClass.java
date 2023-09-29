package chaining_2_assignment_week3_day2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {

	public static RequestSpecification input;
	public   Response response;
	public static String incidentid;
	@BeforeMethod
	public void baseClass() {
		
		//endpoint
			RestAssured.baseURI=("https://mukeshtest1.atlassian.net/rest/api/2/issue/");
		//authorization
			RestAssured.authentication=RestAssured.preemptive().basic("mukesh.arvind92@gmail.com","ATATT3xFfGF0KdfbnLbrR44MIPsqFWHhRKUCA3c8Emxl3LmixlgxWM_ouNwh0MU-FRVZnlkyxbIiMGyP_t2HmadnM8GLBc0m2-ZOzHiGezL211bDZtegdBBi9t7aC3FMAypAtuQsp76cb_eaCXQ7Hb4r8h5L5ixKM4kSeeivnanI65J8IveMFjA=3838A0A3");
			
	}
}
