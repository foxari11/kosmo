package C_Infoview;

import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.*;

public interface InfoModel {
	
	
	void insertInfo (InfoVO vo) throws SQLException;
	
	
	ArrayList<InfoVO> selectAll() throws SQLException;
	
	
	InfoVO selectByTel() throws SQLException ;

	
	int delete(String tel) throws SQLException ;
}