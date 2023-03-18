package _1_RestAssuredTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured; // **********
import io.restassured.response.Response;

import static io.restassured.RestAssured.*
;public class Demo4_DELETE_Request {
	
	@Test
	public void deleteReq() {
		
		int id = 103;
		
		RestAssured.baseURI = "http://localhost:3000";
		RestAssured.basePath = "/users/"+id;
		
		Response resposeSave =
		
		 given()
				
		.when()
				.delete()
		.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK")
				.log().all()
				
				.extract().response();
				
				String JsonToString = resposeSave.asString();
				
				Assert.assertEquals(JsonToString.contains("{}"), true);
//				System.out.println("saved rePonse : "+resposeSave);
	}

}
