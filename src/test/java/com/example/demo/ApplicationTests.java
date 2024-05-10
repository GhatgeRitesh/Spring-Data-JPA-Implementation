package com.example.demo;

import com.example.demo.Model.UserDAO;
import com.example.demo.Model.UserEntity;
import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Log
class ApplicationTests {

	@Autowired
	private UserDAO userDAO;
	@Test
	void addUser() {
		log.info("Test started");
		UserEntity user=new UserEntity();
		user.setName("Test3");
		user.setDept("IT");
		user.setEmail("test3@gmail.com");
		log.info("Test Finished");
		userDAO.save(user);
	}

	@Test
	void getAllUserAndDelete()
	{
		log.info("test 2 started");
		List<UserEntity> user= userDAO.getAllUserEntities();
		log.info("the Users are :"+user.toString());
		for( UserEntity users:user)
		{
			userDAO.delete(users);
		}
		log.info("test 2 finished");
	}

}
