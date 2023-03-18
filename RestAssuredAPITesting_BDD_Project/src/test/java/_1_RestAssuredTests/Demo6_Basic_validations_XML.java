package _1_RestAssuredTests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Demo6_Basic_validations_XML {
	
//	1. Verifing single content in XML reponse
	@Test(priority = 1)
	public void testSingleContent() {
		given()
		.when()
			.get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
			.body("CUSTOMER.ID",equalTo("15") );
	}
	
//	2. Verifing Multiple contents in XML reponse
	@Test(priority = 2)
	public void testMultipleContents() {
		given()
		.when()
			.get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
			.body("CUSTOMER.ID",equalTo("15") )
			.body("CUSTOMER.FIRSTNAME",equalTo("Bill") )
			.body("CUSTOMER.LASTNAME",equalTo("Clancy") )
			.body("CUSTOMER.STREET",equalTo("319 Upland Pl.") )
			.body("CUSTOMER.CITY",equalTo("Seattle") );
	}
	
//	3. Verifying Multiple XML contents in One shot
	
	@Test(priority = 3)
	public void testMultipleContentsInOneShot() {
		given()
		.when()
			.get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
			.body("CUSTOMER.text()",equalTo("15BillClancy319 Upland Pl.Seattle") );
	}
	
//	4. Find values using XML path in XML response
	
	@Test(priority = 4)
	public void testUsingXMLpath1() {
		given()
		.when()
			.get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
			.body(hasXPath("/CUSTOMER/FIRSTNAME", containsString("Bill")));
	}
	
//	5. Find values using XML path-2 in XML response
	
	@Test(priority = 5)
	public void testUsingXMLpath2() {
		given()
		.when()
			.get("http://www.thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
			.body(hasXPath("/CUSTOMER/FIRSTNAME[text()='Bill']") )
			
			.log().all();
	}
	
	
	
	

}
