import org.testng.Assert;

import io.restassured.path.json.JsonPath;

public class SumValidation {
	

	@org.testng.annotations.Test
	public void GetSum() {

		int sum=0;
		JsonPath js=new JsonPath(Payload.Courses());
	int	count=js.getInt("courses.size()");
	System.out.println(count);
	
	for(int i=0; i<count; i++) {
		
		int price=js.get("courses["+i+"].price");

		int CopiesSold=js.get("courses["+i+"].copies");
		
		int Total=price * CopiesSold;
		System.out.println(Total);
		 sum=sum+Total;
	}
	System.out.println(sum);
	int purchaseAmount=js.getInt("dashboard.purchaseAmount");
	System.out.println(purchaseAmount);
		
	Assert.assertEquals(sum,purchaseAmount );

		
		
	}

}
