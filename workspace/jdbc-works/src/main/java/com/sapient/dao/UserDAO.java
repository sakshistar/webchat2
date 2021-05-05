package com.sapient.dao;

import com.sapient.entity.User;
import com.sapient.interfaces.IUserDAO;
import com.sapient.utils.GetConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO implements IUserDAO {



	public boolean registerUser(User user) {

		String sql = "insert into users values(?,?,?,?,?)";

		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ps.setString(1, user.getUser_id());
			ps.setString(2, user.getEmail());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getName());
			ps.setString(5, user.getDob());

			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			System.out.print(e.getMessage());
			return false;
		}



	}

	public boolean loginUser(String email,String password) {

		String sql = "select count(user_id) from users where binary email = ? and binary password = ?";

		try {
			PreparedStatement ps = GetConnection.getMySQLConn().prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet resultset = ps.executeQuery();
			resultset.next();
			return resultset.getInt(1)>0; //checking if resultset is empty or not
		} catch (SQLException e) {
			System.out.print(e.getMessage());
			return false;
		}
	}

	public boolean getUser(String user_id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean changePassword(String user_id, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	



}

