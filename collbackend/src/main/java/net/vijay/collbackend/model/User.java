package net.vijay.collbackend.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Users")
public class User extends BaseDomain implements Serializable {
	
	private static final long  serialVersionUID = 123456789876L;
	
	//@GeneratedValue(generator=GenerationType.SEQUENCE)
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int user_id;
	@NotEmpty(message = "Please enter user name")
	private String user_name;
	@NotEmpty(message = "Please enter password")
	private String password;
	@NotEmpty(message = "Please enter confirm Password")
	private String cPassword;
	@NotEmpty(message = "Please Enter email")
	private String email;
	@NotEmpty(message = "Please enter contact number")
	private String contact;
	private String role;
	private char isOnline;

//	private MultipartFile image;
	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public char getIsOnline() {
		return isOnline;
	}
	public void setIsOnline(char isOnline) {
		this.isOnline = isOnline;
	}
	/*
	public MultipartFile getImage() {
		return image;
	}
	public void setImage(MultipartFile image) {
		this.image = image;
	}
	*/
	
	
	

}
