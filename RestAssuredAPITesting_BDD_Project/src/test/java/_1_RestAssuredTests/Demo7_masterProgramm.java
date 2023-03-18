package _1_RestAssuredTests;

import java.util.ArrayList;
import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class Demo7_masterProgramm {

	HashMap map = new HashMap();

	@Test (priority = 1)
	public void postRequest() {
		map.put("name", RestUtils.getName());
		map.put("location",RestUtils.getLocation());
		map.put("phone", RestUtils.getPhone());

		ArrayList<String> courceslist = new ArrayList<String>();
		courceslist.add("ODI");
		courceslist.add("T20I");

		map.put("cources", courceslist);

		RestAssured.baseURI = "http://localhost:3000";
		RestAssured.basePath = "/users";

		given()
		
			.contentType(ContentType.JSON)
//			.contentType("application/json")
			.body(map)
		
		.when()
		
			.post()
		
		.then()
		
			.statusCode(201)
			.log().body();

	}




	@Test (priority = 2)
	public void GetRequest() {

		given()

		.when()
		.get("http://localhost:3000/users/107")
		.then()
		.statusCode(200)
		.assertThat().body("id", equalTo(107))
		.log().all();

	}

}
