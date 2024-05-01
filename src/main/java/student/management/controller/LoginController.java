package student.management.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import student.management.model.Login;
import student.management.model.User;
import student.management.service.StudentUserService;

@Controller
public class LoginController {

  @Autowired
  StudentUserService userService;

  @RequestMapping(value = "/loginpage", method = RequestMethod.GET)
  public ModelAndView disLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView o = new ModelAndView("loginpage");
    o.addObject("login", new Login());

    return o;
  }

  @RequestMapping(value = "/loginmethod", method = RequestMethod.POST)
  public ModelAndView dislogin(HttpServletRequest request, HttpServletResponse response,
      @ModelAttribute("login") Login login) {
    ModelAndView o = null;
   

    User user = userService.implUser(login);

    if (null != user) {
      o = new ModelAndView("main");
      o.addObject("firstname", user.getFirstname());
      o.addObject("username", user.getUsername());
    }
    else {
      o = new ModelAndView("login");
      o.addObject("message", "Please check your Username or password");
    }
    

    return o;
  }

  
}
