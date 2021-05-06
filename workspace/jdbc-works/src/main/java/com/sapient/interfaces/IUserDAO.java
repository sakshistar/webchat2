package com.sapient.interfaces;

import com.sapient.entity.User;

public interface IUserDAO {
	
	public boolean registerUser(User user);
	
	public boolean loginUser(String email,String password);
	
	public boolean getUser(String user_id);
	
	public boolean changePassword(String email,String password);
	
	public boolean deleteUser(String email);
	

}


