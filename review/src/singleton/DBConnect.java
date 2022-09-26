package singleton;

/*** singleton 패턴 ***/

public class DBConnect {
	
	private DBConnect() {
		System.out.println("실제 디비 연결");
	}
	
	private static DBConnect con = null;	// 멤버 변수 ( 나도헷갈려서 써놓음)
 
	public static DBConnect getInstance() {
		if ( con == null) {
			 con = new DBConnect();
		}
		return con;
	}

}
