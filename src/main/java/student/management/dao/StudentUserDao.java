package student.management.dao;

import student.management.model.Login;
import student.management.model.User;

public interface StudentUserDao {

	  int reg(User user);

	  User implUser(Login login);
	}
