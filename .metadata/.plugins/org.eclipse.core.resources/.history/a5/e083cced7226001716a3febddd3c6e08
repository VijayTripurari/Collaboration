package net.vijay.collbackend.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.vijay.collbackend.model.User;


@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private List<User> users = new ArrayList<User>();
	
	public UserDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	

	@Transactional
	public boolean addUser(User user) {
		
		try{
			sessionFactory.getCurrentSession().persist(user);
			return true;
			}
		catch(Exception ex)
		{
		return false;
		}
	}
    @Transactional
	public boolean updateUser(User user) {
    	try{
			sessionFactory.getCurrentSession().update(user);
			return true;
			}
		catch(Exception ex)
		{
		return false;
		}
	}

    @Transactional
	public boolean deleteUser(User user) {
		try{
			sessionFactory.getCurrentSession().delete(user);;
			return true;
			}
		catch(Exception ex)
		{
		return false;
		}
	}

	public User getUserById(int userID) {
		
		return  (User)sessionFactory.getCurrentSession().get(User.class, userID);
	}

	public User getUserByName(String name) {
		
		// TODO Auto-generated method stub
				String hql = "from User where user_name=" + "'" + name + "'";
				@SuppressWarnings("rawtypes")
				Query query = sessionFactory.getCurrentSession().createQuery(hql);
				@SuppressWarnings("unchecked")
				List<User> list = (List<User>) query.getResultList();

				if (list != null && !list.isEmpty()) {
					System.out.println("username retrieved from DAOImpl");
					return list.get(0);
				} else {
					return null;
				}
	}

	public List<User> list() {
		
		users = sessionFactory.getCurrentSession().createQuery("from User").list();
		return users;
	}

	public User isValidUser(String email, String password) {
		String hql = "from User where email = '"+ email + "' and password =  '" + password + "'";
		@SuppressWarnings("rawtypes")
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<User> lst =(List<User>)query.getResultList();
		
		if( (lst != null)   &&  (!lst.isEmpty())  )
		{
			return lst.get(0);
		}
		else
		    return null;
	}

	public void setOnline(int userID) {
	
	logger.debug("starting of the method setOnline()");
	String hql = "UPDATE  User SET  isOnline = 'Y' where user_id = " + userID;
	logger.debug("hql:" + hql);
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	 query.executeUpdate();
	 logger.debug("ending of the method setOnline() ");
		
	}

	public void setOffline(int userID) {
	 logger.debug("starting of the method setOffline()");
	 String hql = "UPDATE User SET isOffline = 'N' where user_id = " + userID;
	 logger.debug("hql:" + hql);
	 Query query = sessionFactory.getCurrentSession().createQuery(hql);
	   query.executeUpdate();
	   logger.debug("ending of the metod setOffline()");

	}

}
