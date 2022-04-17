package QA.TestAPI;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class SearchAboutProduct {
	@Test
	 public void search_About_existing_Product_byName() {
		  given().get("http://localhost:3030/products?name=Duracell - AA 1.5V CopperTop Batteries (4-Pack)").then().assertThat().statusCode(200);
	  }
	  
	  @Test
	  public void search_About_Not_existing_Product_byName() {
		  given().get("http://localhost:3030/products/?name=Duracell").then().assertThat().statusCode(200);
	  }
	  @Test
	  public void search_About_existing_Product_Validate_Data_byName() {
		  given().get("http://localhost:3030/products?name=Duracell - AA 1.5V CopperTop Batteries (4-Pack)").then().assertThat().body("data[0].'id'", equalTo(48530)).and().
		  assertThat().body("data[0].'name'", equalTo("Duracell - AA 1.5V CopperTop Batteries (4-Pack)")).and().
		  assertThat().body("data[0].'type'", equalTo("HardGood"));
;
	  }
	  @Test
	  public void search_About_Notexisting_Product_Validate_Data_byName(){
		  given().get("http://localhost:3030/products?name=AA 1.5V CopperTop Batteries (4-Pack)").then().assertThat().body("total", equalTo(0));
	  }
	  
	  @Test
	  public void Response_code_search_using_Limits() {
		  given().get("http://localhost:3030/products?$limit=10").then().assertThat().statusCode(200);
	  }
	  
	  @Test
	  public void CheckValidation_search_using_larg_Limits() {
		  given().get("http://localhost:3030/products?$limit=1008522041763712").then().assertThat().body("limit", equalTo(25));
	  }
	  
	  public void Response_code_search_using_Limits_invalidinput() {
		  given().get("http://localhost:3030/products?$limit=asdgawq").then().assertThat().statusCode(500);
	  }
}
