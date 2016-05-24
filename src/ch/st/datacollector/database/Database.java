package ch.st.datacollector.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 * Created by Phong6698 on 15.05.2016.
 * Class for connect to the database
 */
class Database {

    private Statement stmt = null;
    Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	void openCon(){
		try {
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String DB_URL = "jdbc:mysql://localhost:3307/summoner-tracker";
            String USER = "root";
            String PASS = "";
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL, USER, PASS);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No Database found!", "Network Error!", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	void closeCon(){
		try {
			if(con != null){
				con.close();
			}else if(stmt != null){
				stmt.close();
			}else if(ps != null){
				ps.close();
			}else if(rs != null){
				rs.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
