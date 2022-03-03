package HandlePayload;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.jvnet.staxex.StAxSOAPBody.Payload;
import org.testng.annotations.Test;


public class AddBook {
	
	
	@Test
	public void AddBook() {
		

		RestAssured.baseURI="http://216.10.245.166";
        String response = given().log().all()
        		.header("Content-Type","application/json")
        .body(Payload2.AddBookBody("qaq","123"))
        .when().post("/Library/Addbook.php")
                 .then().assertThat().statusCode(200).body("Msg", equalTo("successfully added"))
                 .header("Server", "Apache").extract().response().asString();
        System.out.println("Add BOOK Response is : "+response);
//	System.out.println("Add Book Respinse :"+response);
		
//	JsonPath js=new JsonPath(response);
//	String BookID=js.getString("ID");
//	System.out.println(BookID);
		
		
	}
	

}
