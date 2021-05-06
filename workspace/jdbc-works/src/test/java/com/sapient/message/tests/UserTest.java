package com.sapient.message.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sapient.dao.MessageDAO;
import com.sapient.dao.UserDAO;
import com.sapient.entity.Message;
import com.sapient.entity.User;
import com.sapient.interfaces.IMessageDAO;
import com.sapient.interfaces.IUserDAO;

public class UserTest {
	
	private User user = null;
	private IUserDAO  dao = null;
	
	@Before
	public void setUp() {
		user = new User();
		dao = new UserDAO(); 
		
	}

	@Test
	public void userLogin() {
		assertEquals(true,dao.loginUser("user2@gmail.com", "user2"));
	}
	
	@Test
	public void userRegister() {
		user.setUser_id("U106");
		user.setEmail("user7@gmail.com");
		user.setPassword("user7");
		user.setName("User7");
		user.setDob("1995-02-6");
		assertEquals(false,dao.registerUser(user));
	}
	
	@Test
	public void getUser() {
		
	}
	
	@Test
	public void changePassword() {
		
	}
	

}
