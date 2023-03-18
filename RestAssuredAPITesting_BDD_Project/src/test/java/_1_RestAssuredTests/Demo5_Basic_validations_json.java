package _1_RestAssuredTests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.codehaus.groovy.transform.EqualsAndHashCodeASTTransformation;
import org.testng.annotations.Test;

public class Demo5_Basic_validations_json {
	
	@Test(priority = 1)
	public void testStatusCode() {
		  given()
		 .when()
		 		.get("http://localhost:3000/users")
		 .then()
				.statusCode(200);
//				.log().all();
		
	}
	
	@Test(priority = 2)
	public void logResponse() {
		given()
		.when()
				.get("http://localhost:3000/users")
		.then()
		.statusCode(200);
//		.log().all();
	}
	
//	Verifying single content in response body
	@Test(priority = 3)
	public void testSingleContent() {
		given()
		.when()
			.get("http://localhost:3000/users/1")
		.then()
				.statusCode(200)
				.body("location", equalTo("INDIA"));
	}
	
//	Verifying multiple content in response body
	/*
	@Test(priority = 4)
	public void testMultipleContent() {
		given()
		.when()
			.get("http://localhost:3000/users/1")
		.then()
				.statusCode(200)
				.body("[0].location", hasItems("INDIA","AUS","RUS")); // getting error
	}
	*/
	
	
//	Verifying single content in response body
	@Test(priority = 5)
	public void testParamsAndHeaders() {
		given()
				.param("mobile", "iPhone 13 mini")
				.header("myHeaderKEY","myValue")
		.when()
			.get("http://localhost:3000/users/1")
		.then()
				.statusCode(200)
				.log().all();
	}
	
	
	

}
