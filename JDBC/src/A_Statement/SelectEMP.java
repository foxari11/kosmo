package A_Statement;

import java.sql.*;

public class SelectEMP {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 System.out.println("드라이버 로딩 성공2");
			 
			 
			 // 연결객체 얻어오기
			 String url = "jdbc:oracle:thin:@192.168.0.79:1521:xe";
			 String user = "scott";
			 String pass = "tiger";
			 
			 
			 Connection con = DriverManager.getConnection(url, user, pass);
			 System.out.println("디비 연결 성공2");
			 // 3. sql 묹
			
			 String sql = "SELECT empno, ename, sal, job from emp";
			 
			 // 4. SQL 전송객체
			 Statement stmt = con.createStatement();
			 
			 // 5. SQL 전송
			 
			 /*		-ResultSet executeQuery() : SELECT
			  * 	-int executeUpdate() : INSERT/DELETE/UPDATE
			  * 
			  */
			 
			 ResultSet rs = stmt.executeQuery(sql);
			 while(rs.next()) {
				int eno 		= rs.getInt("EMPNO");
				String ename 	= rs.getString("ENAME");
				int sal 		= rs.getInt("SAL");
				String job 		= rs.getString("JOB");
				System.out.println(eno + "/" +ename+ "/" + sal + " /" + job );
			 }

			 
			 // 6. 닫기 
			 rs.close();
			 stmt.close();
			 con.close();
			 
		} catch (Exception e) {
			System.out.println("DB 실패  : " + e);
			e.printStackTrace();
		}

	}

}
