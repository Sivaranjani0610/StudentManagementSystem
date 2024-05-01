package student.management.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import student.management.dao.StudentDao;
import student.management.model.InactiveStudents;
import student.management.model.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentDao dao; 
	@RequestMapping(value="/user")
	public ModelAndView user(HttpServletResponse response) throws IOException{
	return new ModelAndView("user");
	}
	
	
	
	
	@RequestMapping("/")
	public String startView() {
		return "redirect:/viewstudents";
	}
	
	@RequestMapping("/studentform")
	public String showForm(Model m) {
		m.addAttribute("command", new Student());
		return "studentform";
	}

	@RequestMapping(value = "/addnewstud", method = RequestMethod.POST)
	public String addnewstud(@ModelAttribute("prod") Student prod) {
		dao.addnewstud(prod);
		return "redirect:/viewstudents";
	}
	@RequestMapping(value = "/inactive/{studentid}", method =  RequestMethod.GET)
	public String insert(@PathVariable int studentid) {
		dao.insert(studentid);
		return "redirect:/viewstudents";
	}
	@RequestMapping("/Inactivestudents")
	public String viewinactive(Model m) {
		List<InactiveStudents> list = dao.getInactiveStudents();
		m.addAttribute("list", list);
		return "Inactivestudents";
	}

	@RequestMapping("/viewstudents")
	public String viewstud(Model m) {
		List<Student> list = dao.getAllStudents();
		m.addAttribute("list", list);
		return "viewstudents";
	}
	

	@RequestMapping(value = "/editstud/{studentid}")
	public String editstud(@PathVariable int studentid, Model m) {
		Student stud = dao.getStudentById(studentid);
		m.addAttribute("command", stud);
		return "studenteditform";
	}
	@RequestMapping(value = "/studeditsubmit/{studentid}", method = RequestMethod.POST)
	public String editstudsubmit(@PathVariable int studentid,@ModelAttribute("stud") Student stud) {
		
		dao.newstudupdate(stud);
		return "redirect:/viewstudents";
	}
	

	@RequestMapping(value = "/deletestud/{studentid}", method = RequestMethod.GET)
	public String delete(@PathVariable int studentid) {
		dao.deletestudent(studentid);
		return "redirect:/viewstudents";
	}
	
	@RequestMapping(value = "/deleteitem/{id}", method = RequestMethod.GET)
	public String deleteinactive(@PathVariable int id) {
		dao.deletedeativatestudents(id);
		return "redirect:/Inactivestudents";
	}
	}  



