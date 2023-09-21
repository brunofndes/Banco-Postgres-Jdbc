package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexaojdbc.SingleConenection;
import model.Userposjava;

public class UserPosDao {

	private Connection connection;
	
	public UserPosDao() 
	{
		connection = SingleConenection.getConnection();
	}
	
	public void salvar(Userposjava userposjava) {
				
		try {
			String sql = "insert into userposjava (id,nome,email) values (?,?,?)";
			PreparedStatement insert = connection.prepareStatement(sql);
			insert.setLong(1, userposjava.getId());
			insert.setString(2, userposjava.getNome());
			insert.setString(3, userposjava.getEmail());
			insert.execute();
			connection.commit(); // salva no banco
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
}
