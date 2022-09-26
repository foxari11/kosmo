package singleton;

public class workA {
	
	
	DBConnect con;
	public workA() {
		con= DBConnect.getInstance();
	}
	
	public void use() {
		System.out.println("A 작업");
	}

}
