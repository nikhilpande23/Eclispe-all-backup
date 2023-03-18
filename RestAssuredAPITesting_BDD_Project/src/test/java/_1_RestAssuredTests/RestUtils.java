package _1_RestAssuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String  getName() {
		String generateNAME = RandomStringUtils.randomAlphabetic(3);
		return("dNAME"+generateNAME);
	}
	
	public static String getLocation() {
		String generateLocation = RandomStringUtils.randomAlphabetic(4);
		return generateLocation;
	}
	
	public static String getPhone() {
		String generatePhone = RandomStringUtils.randomNumeric(10);
		return generatePhone;
	}
	
	public static String getCources() {
		String generateCources = RandomStringUtils.randomAlphabetic(6);
		return ("Subject"+generateCources);
	}
	
//	---------------------------------------------------------------------------
	
	public static String getJob() {
		String generateJOB = RandomStringUtils.randomAlphabetic(3);
		return("dummyJOB"+generateJOB);
	}
	
	public static String getSalary () {
		String generateSalary = RandomStringUtils.randomNumeric(3);
		return generateSalary;
	}
	
	public static String getAge() {
		String generateAge = RandomStringUtils.randomNumeric(2);
		return generateAge;
		
	}
	

}
