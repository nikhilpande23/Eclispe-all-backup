package _1_RestAssuredTests;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import groovy.util.logging.Log;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;

public class Demo3_PUT_Request {
	
	// PUT - update 
	
	HashMap map = new HashMap();
	
	
	@BeforeTest
	public void putBody() {
		map.put("name", RestUtils.getName());
		map.put("location",RestUtils.getLocation());
		map.put("phone", RestUtils.getPhone());
		map.put("cources", RestUtils.getCources());
		
		int emp_id = 9;
		
		RestAssured.baseURI = "http://localhost:3000";
		RestAssured.basePath = "/users/"+emp_id;
	}
	
	@Test
	public void requestPut() {
		given()
				.contentType("application/json")
				.body(map)
		
		.when()
				.put()
		
		.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK")
				.log().all();
	}

}
