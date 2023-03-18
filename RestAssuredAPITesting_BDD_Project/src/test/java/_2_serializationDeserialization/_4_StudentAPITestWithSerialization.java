package _2_serializationDeserialization;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.ResponseBodyExtractionOptions;

public class _4_StudentAPITestWithSerialization {
	
	@Test (priority = 1)
	public void createNewSerialization() {
		
		ArrayList<String>  cources = new ArrayList<String>();
		cources.add("cs1");
		cources.add("cs2");
		
		_3_Student stu= new _3_Student();
		
		stu.setName("V. Sehwag");
		stu.setLocation("Multan");
		stu.setPhone(952276707);
		stu.setCources(cources);
		stu.setId(150);
		
		
		 given()
		 	.contentType(ContentType.JSON)
		 	.body(stu)
		.when()
			.post("http://localhost:3000/users")
		.then()
			.statusCode(201)
			.log().all();
	}
	
//	@Test // not working deserilization
//	public void DeSerializationStudent() throws Exception {
//		_3_Student stu = get("http://localhost:3000/users/100").as(_3_Student.class);
//		
//	}
	
}
