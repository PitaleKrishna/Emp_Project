package EmployeMain.File.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

 

import EmployeMain.File.model.Employee;
import EmployeMain.File.service.EmployeeService;

@Controller
@RequestMapping("/Home")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/create-Emp")
	public ResponseEntity<?> createEmployee(@RequestBody Employee emp)
	{
		Employee empResponse=employeeService.createEmp(emp);
		return new ResponseEntity<>(empResponse,HttpStatus.OK);
	}
	
	@GetMapping("/show-Emp")
	public ResponseEntity<?> showEmployee(@RequestBody Employee emp)
	{
		List<Employee> showEmp=employeeService.getEmployee();
		return new ResponseEntity<>(showEmp,HttpStatus.OK);
	}
	
	@DeleteMapping("/Delete-Emp/{id}")
	public ResponseEntity<?> EmpDelete(@PathVariable("id") int id){
		
		employeeService.deleteEmp(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
 
	@PutMapping("/update-emp/{id}")
	public ResponseEntity<?> updateEmployee(@PathVariable("id") Integer id , @RequestBody Employee employee) {

		Employee userResponse = employeeService.updateEmploye(id, employee);
		return new ResponseEntity<>(userResponse, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getEmpById(@PathVariable("id") Integer id) {

		Employee employee=employeeService.getEmployeById(id);

		return new ResponseEntity<>(employee, HttpStatus.OK);
	}
	@PutMapping("/up/{id}")
	public Employee update(@RequestBody Employee employee ,@PathVariable("id") int id)
	{
		employeeService.update(employee, id);
		return employee;
		
	}
	
}
