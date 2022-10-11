package C_Infoview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InfoModelImpl {
	
	final static String DRIVER 	= "oracle.jdbc.driver.OracleDriver";
	final static String URL 	= "jdbc:oracle:thin:@192.168.0.59:1521:xe";
	final static String USER 	= "scott";
	final static String PASS 	= "tiger";
	
	
	
	public InfoModelImpl() throws ClassNotFoundException {
		// 1. 드라이버 로딩 
		Class.forName(DRIVER);
		System.out.println("드라이버 로딩 성공");
	}

	
	
	public void insertInfo(InfoVO vo) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		try {
		con =DriverManager.getConnection(URL,USER,PASS);
		// 3. sql 문장
		String sql = "INSERT INTO info_tab(name, jumin, tel, gender, age, home)"
				+ " VALUES(?,?,?,?,?,?)";
		
		// 4. 전송객체
		ps = con.prepareStatement(sql);
		//  ? 세팅 - #
		ps.setString(1, vo.getName());
		ps.setString(2, vo.getId());
		ps.setString(3, vo.getTel());
		ps.setString(4, vo.getGender());
		ps.setInt(5, vo.getAge());
		ps.setString(6, vo.getHome());
		
		
		
		
		// 5. 전송
		ps.executeUpdate();
		}finally {
			//6. 닫기
			ps.close();
			con.close();
		}
	}
	public ArrayList<InfoVO> selectALL() throws SQLException{
		
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	try {
	con = DriverManager.getConnection(URL,USER,PASS);
	
	String sql = "SELECT * FROM info_tab";
	
	// 4. 전송객체
	ps = con.prepareStatement(sql);
	
	// 5. 전송
	rs = ps.executeQuery();
	
	ArrayList<InfoVO> list = new ArrayList<InfoVO>();
	while(rs.next()) {
		InfoVO vo = new InfoVO();
		vo.setName(rs.getString("NAME"));
		vo.setGender(rs.getString("GENDER"));
		vo.setHome(rs.getString("HOME"));
		vo.setId(rs.getString("JUMIN"));
		vo.setAge(rs.getInt("AGE"));
		vo.setTel(rs.getString("TEL"));
		
		list.add(vo);
		
	}
	
	return list;
	}finally {
		//6. 닫기
		rs.close();
		ps.close();
		con.close();
		}// end of finally
	
	} // end of 
	
	public InfoVO selectByTel(String tel)throws SQLException{
		
		Connection con = null;
		PreparedStatement ps = null;
		InfoVO vo = new InfoVO();
		
		try {
			con = DriverManager.getConnection(URL,USER,PASS);
			//3. SQL 문장
			String sql = "SELECT * FROM info_tab WHERE tel = ?";
			//4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			//5. 전송 
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("NAME"));
				vo.setGender(rs.getString("GENDER"));
				vo.setHome(rs.getString("HOME"));
				vo.setId(rs.getString("JUMIN"));
				vo.setAge(rs.getInt("AGE"));
				vo.setTel(rs.getString("TEL"));
				
			}return vo;
			
		}finally {
			//6. 닫기
			
			ps.close();
			con.close();
			}// end of finally
		
	}
	
//	* 메소드명 : delete 
//	* 인자	 : 전화번호
//	* 리턴값 	 : 삭제한 행 수
//	* 역할     : 전화번호를 넘겨받아 해당 전화버노의 레코드를 삭제


	public int delete(String tel) throws SQLException {
		
		Connection con = null;
		PreparedStatement ps = null;
		InfoVO vo = new InfoVO();
		int result ;
		
		
		try {
			con = DriverManager.getConnection(URL,USER,PASS);
			//3. SQL 문장
			
			String sql = "DELETE FROM info_tab WHERE tel = ?";
			//4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			//5. 전송 
			 ps.executeUpdate();
			
			
			
			return 1;
			}
		finally {
				//6. 닫기
				
				ps.close();
				con.close();
				}
		
	

	}
	
	public void Update(InfoVO vo) throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		
        try {
        	con =DriverManager.getConnection(URL,USER,PASS);
        	
        	String sql = " UPDATE info_tab "
        			+ " SET NAME = ?, jumin = ? , tel = ?, gender = ?, age = ?, home = ? "
        			+ " where tel = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, vo.getName());
    		ps.setString(2, vo.getId());
    		ps.setString(3, vo.getTel());
    		ps.setString(4, vo.getGender());
    		ps.setInt(5, vo.getAge());
    		ps.setString(6, vo.getHome());
    		ps.setString(7, vo.getTel());
            // 실행하기
            ps.executeUpdate();
 
        } catch (SQLException e) {
            System.out.println(e + "=> fail");
            
        }
        finally {
			ps.close();
			con.close();
        }
 
        
    }
	
	
	
	
	
}
