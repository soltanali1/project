package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import DAO.LoginDAO;
import Models.LoginModel;

public class LoginJDBC implements LoginDAO {
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	public LoginModel get(String pass) {
		String sql2 = "SELECT * FROM login WHERE Password = ?";
		Connection conn = null;
	
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql2);
			
			ps.setString(1, pass);
			
			ResultSet rs = ps.executeQuery();
			LoginModel log = new LoginModel();
			log.setId(0);
			
			while (rs.next()) {
				log.setPassword(rs.getString("Password"));
				log.setId(rs.getInt("id"));
			}
			ps.close();
			return log;
			} catch (SQLException e) {
				throw new RuntimeException(e);

			} finally {
				if (conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
					}
				}
			}
}
}
