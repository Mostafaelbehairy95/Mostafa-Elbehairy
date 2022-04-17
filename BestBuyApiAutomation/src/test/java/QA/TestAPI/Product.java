package QA.TestAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;

import static io.restassured.RestAssured.given;
public class Product {
  @Test
  public void Validate_vaild_reponse_code_For_specifcProducts() {
	  given().get("http://localhost:3030/products/9132294").then().assertThat().statusCode(200);
  }
  
  @Test
  public void Validate_invaild_reponse_code_For_specifcProducts() {
	  given().get("http://localhost:3030/products/91294").then().assertThat().statusCode(404);
  }
  @Test
  public void Validate_vaild_reponse_data_For_specifcProducts() {
	  given().get("http://localhost:3030/products/9132294").then().assertThat().body("id", equalTo(9132294)).and().
	  assertThat().body("name", equalTo("Yamaha - P32D Pianica - Brown/White")).and().
	  assertThat().body("type", equalTo("HardGood")).and().
	  assertThat().body("categories[0].name", equalTo("Musical Instruments")).and().
	  assertThat().body("categories[1].name", equalTo("Keyboards")).and().
	  assertThat().body("categories[2].name", equalTo("Portable Keyboards"));
  }
  @Test
  public void Validate_invaild_reponse_data_For_specifcProducts(){
	  String response =RestAssured.get("http://localhost:3030/products/91322").andReturn().asString();
	  Assert.assertTrue(response.contains("No record found for id '91322'"));
  }
}
