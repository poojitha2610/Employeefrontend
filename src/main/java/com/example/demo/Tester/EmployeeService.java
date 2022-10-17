package com.example.demo.Tester;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repo.MyRepo;



@Service
public class EmployeeService {
@Autowired
MyRepo myRepo;
public List<Employee> displayData(){
	return myRepo.findAll();
	
}
public void saveEmployee(Employee employee) {
	myRepo.save(employee);
}
public Employee getEmployee(int id) {
return myRepo.findById((long) id).get();

}
public void deleteEmployee(int id) {
	myRepo.deleteById((long) id);;
	
}
}
