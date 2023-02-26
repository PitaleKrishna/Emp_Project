package EmployeMain.File.service;

import java.util.List;

import EmployeMain.File.model.Employee;

public interface EmployeeService {
	
	public Employee createEmp(Employee emp);
	public List<Employee> getEmployee();
	public void deleteEmp(int id);
	public Employee updateEmploye(Integer id,Employee employee);
	 
	public Employee getEmployeById(int id);
	public Employee update(Employee employee,int id);
	
 
}
