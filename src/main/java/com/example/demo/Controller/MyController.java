package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Model.Employee;
import com.example.demo.Tester.EmployeeService;


@Controller
public class MyController {
@Autowired	
EmployeeService service;
@RequestMapping("/display")
public String shoehomepage(Model model) {
	System.out.println("display is called");
	List<Employee> list=service.displayData();
    model.addAttribute("abc", list);
	return "show";
}
@RequestMapping("/addData")
public String newData(Model model) {
	Employee employee=new Employee();
	model.addAttribute("employee", employee);
	return "add_pro";
}

@RequestMapping(value="/save1",method = RequestMethod.POST)
public String saveAfter(@ModelAttribute("employee") Employee employee) {
	service.saveEmployee(employee);
	return "redirect:/display";
	
}
@RequestMapping("/edit/{id}")
public ModelAndView editData(@PathVariable(name = "id")int id) {
	ModelAndView modelAndView=new ModelAndView("edit_data");
	Employee employee=service.getEmployee(id);
	modelAndView.addObject("employee",employee);
	return modelAndView;
	
}
@RequestMapping("/delete/{id}")
public String deleteData(@PathVariable(name = "id")int id) {
	service.deleteEmployee(id);
	return "redirect:/display";
	
}
}
