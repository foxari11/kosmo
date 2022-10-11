package A_Statement;

import java.sql.*;

public class SelectEMPDept {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 System.out.println("드라이버 로딩 성공2");
			 
			 
			 // 연결객체 얻어오기
			 String url = "jdbc:oracle:thin:@192.168.0.59:1521:xe";
			 String user = "scott";
			 String pass = "tiger";
			 
			 
			 Connection con = DriverManager.getConnection(url, user, pass);
			 System.out.println("디비 연결 성공2");
			 // 3. sql 묹
			
			 
			 // -> 20번 부서의 사원들의 정보 - 사번, 사원명, 월급, 부서명, 근무지 
			 
			 String sql = "SELECT e.empno 사번, e.ename 이름, e.sal 월급, e.job 잡, d.dname 부서명, d.loc 근무지 from emp e full outer join dept d on e.deptno=d.deptno where e.deptno = 20";
			 // 4. SQL 전송객체
			 Statement stmt = con.createStatement();
			 
			 // 5. SQL 전송
			 
			 /*		-ResultSet executeQuery() : SELECT
			  * 	-int executeUpdate() : INSERT/DELETE/UPDATE
			  * 
			  */
			 
			 ResultSet rs = stmt.executeQuery(sql);
			 while(rs.next()) {
				int eno 		= rs.getInt("사번");
				String ename 	= rs.getString("이름");
				int sal 		= rs.getInt("월급");
				String job 		= rs.getString("잡");
				String dloc     = rs.getString("근무지");
				String dname 	= rs.getString("부서명");
				 
				System.out.println(eno + "/" +ename+ "/" + sal + " /" + job + "/" + dloc  + "/" + dname);
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
