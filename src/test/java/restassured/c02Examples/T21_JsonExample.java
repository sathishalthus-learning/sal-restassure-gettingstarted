package restassured.c02Examples;

import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.config.JsonConfig;
import io.restassured.path.json.config.JsonPathConfig.NumberReturnType;

public class T21_JsonExample {
	
//	1.	
////	---------------------------------------
//	@Test()
//	public void json1_EqualTo() {
//	
//		given()
//			//
//		.when()
//			.get("http://localhost:3000/lotto")
//		.then()
//			.log().body()
////			.body("lottoId", equalTo(5))
//			.assertThat().body("lottoId", equalTo(5))
//		;
//	}

//	2.
//	---------------------------------------
//	@Test()
//	public void json2_HasItems() {
//		given()
//			//
//		.when()
//			.get("http://localhost:3000/lotto")
//		.then()
////			.body("winners.winnerId", hasItems(23,54))
//			.assertThat().body("winners.winnerId", hasItems(23,54))
//		;
//	}
	
//	3.
//	---------------------------------------
//	@Test()
//	public void json3_FloatsDoubles() {
//		given()
//			//
//		.when()
//			.get("http://localhost:3000/store")
//		.then()
//			.body("book[0].price",is(8.95f))
//		;
//	}
	
//	4.
//	---------------------------------------
//	@Test()
//	public void json4_FloatsDoublesAsBiddeicimal() {
//		given()
//			.config(RestAssured.config().jsonConfig(JsonConfig.jsonConfig().numberReturnType(NumberReturnType.BIG_DECIMAL)))
//		.when()
//			.get("http://localhost:3000/store")
//		.then()
//			.body("book[0].price",is(new BigDecimal(12.12)))
//		;
//	}
	
//	5.---------------------------------------
//	@Test()
//	public void json5_schemaValidation() {
//		given()
//			.config(RestAssured.config().jsonConfig(JsonConfig.jsonConfig().numberReturnType(NumberReturnType.BIG_DECIMAL)))
//		.when()
//			.get("http://localhost:3000/store")
//		.then()
//			.body("book[0].price",is(new BigDecimal(12.12)))
//		;
//	}
}
