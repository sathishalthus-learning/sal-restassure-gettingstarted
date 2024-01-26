package doc.restusage;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.math.BigDecimal;

import org.testng.annotations.Test;

import io.restassured.config.JsonConfig;
import io.restassured.path.json.config.JsonPathConfig.NumberReturnType;

public class Rest02010_JsonExample {
	//
	@Test(priority=1)
	public void getJsonResponse() {
		//
		given()
		.when()
			.get("http://localhost:3000/lotto")
		.then()
			.log().body()
		;
	}
	
	@Test(priority=2)
	public void getJsonResponseValidateResponseForLottoId() {
		//
		given()
		.when()
			.get("http://localhost:3000/lotto")
		.then()
			.log().body()
			.body("lotto.lottoId", equalTo(5))
		;
	}
	
	@Test(priority=3)
	public void getJsonResponseValidateResponseForWinners() {
		//
		given()
		.when()
			.get("http://localhost:3000/lotto")
		.then()
			.log().body()
			.body("lotto.winners.winnerId", hasItems(23,54))
		;
	}
	
	@Test(priority=4)
	public void getJsonResponseValidateFloatsAndDoublesAsBigdecimal() {
		//
		given()
			.baseUri("http://localhost:3000")
		.when()
			.get("/price")
		.then()
			.log().body()
			.body("price",is(12.12f))
		;
	}
	
	@Test(priority=5)
	public void getJsonResponseValidateConfigureBigdecimal() {
		//
		given()
			.baseUri("http://localhost:3000")
			.config(config.jsonConfig(JsonConfig.jsonConfig().numberReturnType(NumberReturnType.BIG_DECIMAL)))
		.when()
			.get("/price")
		.then()
			.log().body()
			.body("price",is(new BigDecimal(12.12)))
		;
	}

}
