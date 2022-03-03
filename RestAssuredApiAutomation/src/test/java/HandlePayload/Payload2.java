package HandlePayload;

public class Payload2 {

public static String AddBookBody(String isbn, String aisle) {
		
		return "\"name\":\"Cypess Doc1\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"John TJ\"\r\n"
				+ "}";
	}
	
}
