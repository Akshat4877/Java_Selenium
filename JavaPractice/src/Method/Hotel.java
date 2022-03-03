package Method;

public class Hotel {
	
	Food servefood(int money, String order){
		Food f=new Food();
		f.name=order;
		f.price=money;
		return f;				
	}
	
	public static void main(String[] args) {
		Hotel h=new Hotel();
		Food fd=h.servefood(100, "chillii paneer");
		System.out.println(fd.name);
		System.out.println(fd.price);
		Food f2=fd;
		f2.name="Pizza";
		f2.price=500;
		System.out.println(f2.name);
		System.out.println(f2.price);	
	}

}
