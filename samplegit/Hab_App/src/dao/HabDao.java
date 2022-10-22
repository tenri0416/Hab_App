package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javaBrans.DateJB;

public class HabDao {
	private final String DB_USER="localhost";
	private final String DB_PASS="n5qgmzF7!";
	String JDBC_URL = "jdbc:mysql://localhost:3306/example?allowPublicKeyRetrieval=true&useSSL=false";
	
	public List<DateJB>findAll(){
		
		List<DateJB>hubList=new ArrayList<>();
		
		try(Connection conn=DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
			
			String sql="select * from hub";
			PreparedStatement pStmt=conn.prepareStatement(sql);
			
			ResultSet rs=pStmt.executeQuery();
			
			
			while(rs.next()) {
				String date=rs.getString("date");
				String content=rs.getString("content");
				int money=rs.getInt("money");
				
				
				DateJB datejb=new DateJB(date,content,money);
				hubList.add(datejb);
			}
		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return hubList;
	}
}
