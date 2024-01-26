package doc.restusage;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.InputStream;
import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

import org.testng.annotations.Test;

import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;

public class Rest05000_GettingResponseData {
	//
	@Test(priority=1)
	public void getResponseData() {
		//
		InputStream inputStream = get("http://localhost:3000/lotto").asInputStream();
		byte[] byteArray = get("http://localhost:3000/lotto").asByteArray();
		String json = get("http://localhost:3000/lotto").asString();
		
//		System.out.println(inputStream.);
//		System.out.println(byteArray);
		System.out.println(json);
	}
	
	@Test(priority=2)
	public void extractValuesFromResponse() {
		//
		Integer lottoId = 
		given()
			.baseUri("http://localhost:3000/")
		.when()
			.get("/lotto")
		.then()
			.extract()
			.path("lotto.lottoId")
		;
		System.out.println(lottoId);
	}
	
	@Test(priority=3)
	public void extractValuesFromResponseMultipleValues() {
		//
		Response response = 
		given()
			.baseUri("http://localhost:3000/")
		.when()
			.get("/lotto")
		.then()
			.extract()
			.response()
		;
		int lottoId = response.path("lotto.lottoId");
		System.out.println(lottoId);
		List<Integer> winners = response.path("lotto.winners.winnerId");
		System.out.println(winners);
	}
	
	
	@Test(priority=4)
	public void extractValuesFromResponseUsingJsonpath() {
		//
		Response response = 
		given()
			.baseUri("http://localhost:3000/")
		.when()
			.get("/lotto")
		.then()
			.extract()
			.response()
		;
		int lottoId = response
	}

}
