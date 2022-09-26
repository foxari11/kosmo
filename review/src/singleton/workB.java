package singleton;

public class workB {
	
	DBConnect con;
	
	public workB() {
		con = DBConnect.getInstance();
	}
	
	public void use() {
		System.out.println("B 작업");
	}

}
