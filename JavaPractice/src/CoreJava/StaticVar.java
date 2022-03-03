package CoreJava;

public class StaticVar {
	
	String Studentname;
	int rollno;
	static String clgname;
	
	
	//staic method example run
	//temaple run coz all toys runs
	 
	public static void run() {
		System.out.println("all toys run");
	}
	
	public static void main(String[] args) {
		StaticVar s1=new StaticVar();
		s1.Studentname="mack";
		s1.rollno=1;
		//s1.clgname="BBDIT";
		StaticVar.clgname="BBDIt";
		System.out.println(StaticVar.clgname);
		StaticVar s2=new StaticVar();
		s2.Studentname="mack";
		s2.rollno=2;
		//s2.clgname="BBDIT";
		System.out.println(StaticVar.clgname);
		StaticVar.run();
	
	}

}
