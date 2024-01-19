package tests;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.containsPath;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class T1_Imports {

	@Test
	public void firstTest() {
		System.out.println("first test");
		given().when().then();
		containsPath("");
		equalTo(0);
	}
}
