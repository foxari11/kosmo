package singleton;

public class workC {
	
	DBConnect con;
	
	public workC() {
		con= DBConnect.getInstance();
		
	}
	
	public void use() {
		System.out.println("C 작업");
	}

}
