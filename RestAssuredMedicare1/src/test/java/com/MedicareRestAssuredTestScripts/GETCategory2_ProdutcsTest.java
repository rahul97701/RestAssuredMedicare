package com.MedicareRestAssuredTestScripts;


import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class GETCategory2_ProdutcsTest {
	
	
	@Test
	public void verifyProducts()  {
		
		
		
			RestAssured
			     .when()
			       .get("http://localhost:8080/medicare/json/data/category/2/products")
			     .then()
			         .assertThat()
			             .statusCode(200)
			             .log().all();
			    
			   
			             
		
		
	}

}