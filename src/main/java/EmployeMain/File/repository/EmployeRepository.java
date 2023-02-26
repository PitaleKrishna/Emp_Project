package EmployeMain.File.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import EmployeMain.File.model.Employee;

public interface EmployeRepository extends JpaRepository<Employee, Integer> {

}
