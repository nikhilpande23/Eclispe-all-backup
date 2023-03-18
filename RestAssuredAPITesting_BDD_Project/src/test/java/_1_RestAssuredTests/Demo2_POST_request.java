package _1_RestAssuredTests;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class Demo2_POST_request {
	
	HashMap map = new HashMap();
	
	@BeforeTest
	public void postData() {
		map.put("name", RestUtils.getName());
		map.put("location",RestUtils.getLocation());
		map.put("phone", RestUtils.getPhone());
		map.put("cources", RestUtils.getCources());
		
		RestAssured.baseURI = "http://localhost:3000";
		RestAssured.basePath = "/users";
	}
	
	@Test
	public void testPOST() {
		
		 given()
		 	.contentType("application/json")
		 	.body(map) // 4th---object input vali gheyachi
		
		
		.when()
			.post()
		
		
		.then()
			.statusCode(201)
//			.statusLine("HTTP/1.1 201")
			.log().all();
	}

}
