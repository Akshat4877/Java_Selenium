import io.restassured.path.json.JsonPath;

//1. Print No of courses returned by API
//2.Print Purchase Amount
//3. Print Title of the first course
//4. Print All course titles and their respective Prices
//5. Print no of copies sold by RPA Course
//6. Verify if Sum of all Course prices matches with Purchase Amount


public class ComplexJsonParse {
	
	
	
	
	

	public static void main(String[] args) {
		
		JsonPath js=new JsonPath(Payload.Courses());
		
		//1. Print No of courses returned by API
		int CourseSize=js.getInt("courses.size()");
		System.out.println(CourseSize);
		
		//2.Print Purchase Amount
		int p=js.getInt("dashboard.purchaseAmount");
		System.out.println(p);
		
		//3. Print Title of the first course
		String title0=js.getString("courses[0].title");
		System.out.println(title0);
		System.out.println("**************************************************************");
		
		for(int i=0; i<CourseSize; i++) {
			
			String AllCoursesTitle=js.getString("courses["+i+"].title");
			System.out.println(AllCoursesTitle);
			
//			if(AllCoursesTitle.equalsIgnoreCase("Cypress")) {
//				String CopiesSold=js.getString("courses["+i+"].copies");
//				System.out.println("Number of Copies Sold is :"+CopiesSold+" of "+ AllCoursesTitle );
//			}
			
			int AllCoursesPrice=js.getInt("courses["+i+"].price");
			System.out.println(AllCoursesPrice);
			
		}
		
		//5. Print no of copies sold by Cypress Course
             for(int i=0; i<CourseSize; i++) {
			
			   String AllCoursesTitle=js.getString("courses["+i+"].title");
			    if(AllCoursesTitle.equalsIgnoreCase("Cypress")) {
				String CopiesSold=js.getString("courses["+i+"].copies");
				System.out.println("Number of Copies Sold is :"+CopiesSold+" of "+ AllCoursesTitle );
				break;
			}		
		}
		
            
	}

}
