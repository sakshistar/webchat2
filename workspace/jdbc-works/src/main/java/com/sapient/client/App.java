package com.sapient.client;

import com.sapient.dao.MessageDAO;
import com.sapient.dao.UserDAO;
import com.sapient.entity.Message;
import com.sapient.interfaces.IMessageDAO;
import com.sapient.interfaces.IUserDAO;

public class App {
	public static void main(String[] args) {
		
		
		IUserDAO userdao = new UserDAO(); 

		System.out.println(userdao.loginUser("user3@gmail.com","user3"));

		

		
//		System.out.println(dao.saveMessage(m) ? "Inserted":"Not Inserted");
		
		
//		System.out.println(dao.getMessage(101));
		
		/*for(Message mm : dao.getAllMessages()) {
			System.out.println(mm);
		}*/
		
		
		
	}
}