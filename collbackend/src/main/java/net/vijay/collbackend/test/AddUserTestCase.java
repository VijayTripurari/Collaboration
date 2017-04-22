package net.vijay.collbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.vijay.collbackend.dao.UserDAO;
import net.vijay.collbackend.dao.UserDAOImpl;
import net.vijay.collbackend.model.User;



public class AddUserTestCase {
	

	private static AnnotationConfigApplicationContext context ;
	
	@Autowired
	private static UserDAO  userDAO;
	
		
	@BeforeClass
	public static void init() 
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("net.vijay.collbackend");
		//context.refresh();
		System.out.println("hello");
		userDAO = (UserDAO)context.getBean("userDAO");	
	
	}
@Test	
  public  void addTestProduct()
  {
	
	   User user = new User();
	 
	   user.setUser_name("vijay");
	   user.setContact("1234567891");
	   user.setPassword("vijay@123");
	   user.setcPassword("vijay@123");
	   user.setEmail("vijay@gmail.com");
	   user.setIsOnline('Y');
	   user.setRole("admin");
	      
	   assertEquals("Successfully added a row inside the table!", true , userDAO.addUser(user));
	  
 }
}