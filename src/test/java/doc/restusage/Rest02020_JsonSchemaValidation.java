package doc.restusage;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

import org.testng.annotations.Test;

import com.github.fge.jsonschema.SchemaVersion;
import com.github.fge.jsonschema.cfg.ValidationConfiguration;
import com.github.fge.jsonschema.main.JsonSchemaFactory;

import io.restassured.module.jsv.JsonSchemaValidator;

public class Rest02020_JsonSchemaValidation {
	//
	@Test(priority=1)
	public void getJsonResponseValidateSchema() {
		//
		given()
			.baseUri("http://localhost:3000")
		.when()
			.get("/book")
		.then()
			.log().body()
			.body(matchesJsonSchemaInClasspath("book-schema.json"))
		;
	}
	
	@Test(priority=2)
	public void getJsonResponseValidateSchemaSettings() {
		//
		JsonSchemaFactory factory = JsonSchemaFactory.newBuilder().setValidationConfiguration(ValidationConfiguration.newBuilder().setDefaultVersion(SchemaVersion.DRAFTV4).freeze()).freeze();
		given()
			.baseUri("http://localhost:3000")
		.when()
			.get("/book")
		.then()
			.log().body()
			.body(matchesJsonSchemaInClasspath("book-schema.json").using(factory))
		;
	}

	@Test(priority=3)
	public void getJsonResponseValidateSchemaWithStaticConfiguration() {
		//
		JsonSchemaValidator.settings = settings.with().jsonSchemaFactory(JsonSchemaFactory.newBuilder().setValidationConfiguration(ValidationConfiguration.newBuilder().setDefaultVersion(SchemaVersion.DRAFTV4).freeze()).freeze()).and().with().checkedValidation(false);
		given()
			.baseUri("http://localhost:3000")
		.when()
			.get("/book")
		.then()
			.log().body()
			.body(matchesJsonSchemaInClasspath("book-schema.json"))
		;
	}
	
	@Test(priority=4)
	public void jsonSchemaValidationWithoutRestAssured() {
		//
		 // Given
        String json = "{\r\n"
        		+ "\"book\":  \r\n"
        		+ "         {  \r\n"
        		+ "            \"author\":\"Nigel Rees\",\r\n"
        		+ "            \"category\":\"reference\",\r\n"
        		+ "            \"price\":8.95,\r\n"
        		+ "            \"title\":\"Sayings of the Century\"\r\n"
        		+ "         }\r\n"
        		+ "}";
 
        // Then
        assertThat(json, matchesJsonSchemaInClasspath("book-schema.json"));
	}
	
	@Test(priority=5)
	public void anonymousJsonRootValidation() {
		//
        given()
        	.body("[1,2,3]")
		.when()
			.get("/json")
		.then()
			.body("$", hasItems(1,2,3))
		;
	}
}
