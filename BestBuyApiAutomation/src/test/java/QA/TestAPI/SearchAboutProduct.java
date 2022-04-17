package QA.TestAPI;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SearchAboutProduct {
	@Test
	 public void search_About_existing_Product() {
		  given().get("http://localhost:3030/products?name=Duracell - AA 1.5V CopperTop Batteries (4-Pack)").then().assertThat().statusCode(200);
	  }
	  
	  @Test
	  public void search_About_Not_existing_Product() {
		  given().get("http://localhost:3030/products/?name=Duracell").then().assertThat().statusCode(200);
	  }
	  @Test
	  public void search_About_existing_Product_Validate_Date() {
		  given().get("http://localhost:3030/products? name=Duracell - AA 1.5V CopperTop Batteries (4-Pack)").then().assertThat().body("data[0].'id'", equalTo(48530)).and().
		  assertThat().body("data[0].'name'", equalTo("Duracell - AA 1.5V CopperTop Batteries (4-Pack)")).and().
		  assertThat().body("data[0].'type'", equalTo("HardGood"));
;
	  }
	  @Test
	  public void search_About_Notexisting_Product_Validate_Date(){
		  given().get("http://localhost:3030/products?name=AA 1.5V CopperTop Batteries (4-Pack)").then().assertThat().body("total", equalTo(0));
	  }
}
