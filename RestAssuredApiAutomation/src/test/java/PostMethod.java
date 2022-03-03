import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.Reporter;


public class PostMethod {
	
	public static void main(String[] args) {
		
		//given -all input details
		//when -Submit the API -resources and http method
		//then- Validate the Response
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
        String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
        .body(Payload.Addplace()).when().post("/maps/api/place/add/json")
                 .then().assertThat().statusCode(200).body("scope", equalTo("APP"))
                 .header("Server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
        System.out.println("Add Place Response is : "+response);
        
        JsonPath js=new JsonPath(response);
        String Place_id=js.getString("place_id");
        System.out.println("Place Id is :"+Place_id);
        
        //////////////////////////////////////////////////////////////////////////////////////////////////////
        
        //put -update place
        String Address="Noor nagar Sihani";
        String putResponse=given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
        .body("{\r\n"
        		+ "\"place_id\":\""+Place_id+"\",\r\n"
        		+ "\"address\":\""+Address+"\",\r\n"
        		+ "\"key\":\"qaclick123\"\r\n"
        		+ "}\r\n"
        		+ "").
        when().put("maps/api/place/update/json")
        .then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"))
        .extract().response().asString();
        System.out.println("Put Response is :"+putResponse);
        
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       
    	//Get Place
    	String getPlaceResponse=given().log().all().queryParam("key", "qaclick123")
    		.queryParam("place_id",Place_id)
    		.when().get("maps/api/place/get/json")
    		.then().assertThat().log().all().statusCode(200).extract().response().asString();
    	System.out.println("Get Response : "+getPlaceResponse);
    	
    	
    	JsonPath js1=ReUsableMethods.rawToJson(getPlaceResponse);
    	String actualAddress =js1.getString("address");
    	System.out.println(actualAddress);
        Assert.assertEquals(actualAddress, Address);        
        
        
        
        
//        String res="";
//        char[] arr=response.toCharArray();
//        System.out.println(arr);
//        for(int i=0; i<arr.length; i++) {
//        	String res1=res+response.charAt(i);
//        	System.out.println(res1);
//        	
//        }
		
		
	}

}
