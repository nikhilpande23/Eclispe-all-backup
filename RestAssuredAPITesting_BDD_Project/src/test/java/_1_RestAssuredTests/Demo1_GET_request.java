package _1_RestAssuredTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo1_GET_request {
	
	@Test
	public void getUserDetails() {
		
		Response res =
		
		given()
		.when()
			.get("http://localhost:3000/users")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.header("Content-Type", "application/json; charset=utf-8")
//			.assertThat().body("name", equalTo("John")) // giving Error
//			.log().all();
			
			.log().body()
			.extract().response();
		
		String JsonToString = res.asString();
		
		Assert.assertEquals(JsonToString.contains("John"), true);
		
		
		
	}

}
