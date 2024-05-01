package student.management.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import student.management.model.User;
import student.management.service.StudentUserService;

@Controller
public class RegistrationController {
  @Autowired
  public StudentUserService userService;

  @InitBinder
  public void initBinder(WebDataBinder dataBinder) {

      StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

      dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
  }
  
  @RequestMapping(value = "/registerpage", method = RequestMethod.GET)
  public ModelAndView disReg(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView o = new ModelAndView("registerpage");
    o.addObject("user", new User());

    return o;
  }

  @RequestMapping(value = "/registermethod", method = RequestMethod.POST)
  public String regUser( @Valid @ModelAttribute("user") User user, BindingResult theBindingResult ) {
	  if (theBindingResult.hasErrors()) {
		  return ("registerpage");
      } else {
          
    userService.register(user);

    return ("main");
  }
  }
}
