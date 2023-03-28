package com.MedicareRestAssuredTestScripts;

	

import org.testng.annotations.Test;

import io.restassured.RestAssured;




public class GetAllProductsTest{
	
	@Test
	public void verifyStatusCode() {
		RestAssured
		     .when()
		       .get("http://localhost:8080/medicare/show/all/products")
		     
		     .then()
		         .assertThat()
		             .statusCode(200)
		             .log().all();
		             
	}

}

