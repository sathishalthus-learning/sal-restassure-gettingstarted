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

public class Rest02030_XmlExample {
	//
	@Test(priority=1)
	public void getJsonResponseValidateSchema() {
		//
		given()
			.baseUri("http://localhost:3000")

			.body(matchesJsonSchemaInClasspath("book-schema.json"))
		;
	}

}
