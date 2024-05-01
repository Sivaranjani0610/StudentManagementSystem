package student.management.service;

import org.springframework.beans.factory.annotation.Autowired;

import student.management.dao.StudentUserDao;
import student.management.model.Login;
import student.management.model.User;

public class StudentUserServiceImpl implements StudentUserService {

	  @Autowired
	  public StudentUserDao userDao;

	  public int register(User user) {
	    return userDao.reg(user);
	  }

	  public User implUser(Login login) {
	    return userDao.implUser(login);
	  }

	}
