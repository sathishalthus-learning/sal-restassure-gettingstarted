package restassured.c02Examples;

import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class T24b_AdvancedJson {
	
//	1.	
//	---------------------------------------
//	@Test()
//	public void jsonExampleEqualTo() {
//	given()
//			//
//		.when()
//			.get("https://petstore.swagger.io/v2/pet/9")
//		.then()
////			.body("id", equalTo(9))
//			.assertThat().body("id", equalTo(9))
//		;
//	}

//	2.
//	---------------------------------------
//	@Test()
//	public void jsonExampleHasItems() {
//		given()
//			//
//		.when()
//			.get("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
//		.then()
////			.body("id", hasItems(9))
//			.assertThat().body("id", hasItems(9))
//		;
//	}
	
//	3.
//	---------------------------------------
//	@Test()
//	public void jsonFloatsDoublesAsBiddeicimal() {
//		get("/price").then().body("price", is(12.12f));
//	
//		given().
//    		config(RestAssured.config().jsonConfig(jsonConfig().numberReturnType(BIG_DECIMAL))).
//		when().
//    		get("/price").
//		then().
//    		body("price", is(new BigDecimal(12.12));
//	}
	
	
//	3.
//	---------------------------------------
//	@Test()
//	public void jsonSchemaValidation() {
//
//	}
//	
//	@Test()
//	public void xmlExample() {
//
//	}
//	
//	@Test()
//	public void advancedXML() {
//
//	}
//	
//	@Test()
//	public void advancedJSON() {
//
//	}
//	
//	@Test()
//	public void deSerializationWithGenereics() {
//
//	}
//	
//	@Test()
//	public void additionalExamples() {
//
//	}
}
