package student.management.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class User {
	 @NotNull(message = "is required")
	    @Size(min = 1, message = "is required")
  private String username;
	
	 @NotNull(message = "is required")
	    @Size(min = 8, message = "the password should be minimum 8")
  private String password;
 
	 private String firstname;
 
	
  public String getUsername() {
    return username;
  }
 

	
  public void setUsername(String username) {
    System.out.println("username: " + username);
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

 
	  
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    System.out.println("firstname: " + firstname);
    this.firstname = firstname;
  }

 

 
 
}
