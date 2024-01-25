package doc.restusage.bExamples;

import static io.restassured.RestAssured.*;

public class Rest02010_JsonExample {
	//
	@Test(priority=1)
	public void getJsonResponse() {
		//
		given()
		.when()
			.get("http://localhost:8080/lotto")
		.then()
			.log().body()
		;
	}

}
