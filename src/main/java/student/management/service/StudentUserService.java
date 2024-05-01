package student.management.service;

import student.management.model.Login;
import student.management.model.User;

public interface StudentUserService {

	  int register(User user);

	  User implUser(Login login);
	}
