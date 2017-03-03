package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

import DAO.SendDAO;
import Models.SendModel;

public class SendJDBC implements SendDAO {
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	public void insert(SendModel sm) {
		
		String sql ="INSERT INTO sendprice" + 
		"(Price, CardId) VALUES (?, ?)";
		Connection conn = null;
		
		try {
			conn =  dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, sm.getPrice());
			ps.setInt(2, sm.getCardId());
			
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			if(conn != null){
				try {
					conn.close();
				}
				catch (SQLException e) {}
			}		
		}	
}
}
