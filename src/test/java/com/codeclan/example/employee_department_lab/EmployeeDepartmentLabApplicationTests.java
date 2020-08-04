package com.codeclan.example.employee_department_lab;

import com.codeclan.example.employee_department_lab.models.Department;
import com.codeclan.example.employee_department_lab.models.Employee;
import com.codeclan.example.employee_department_lab.models.Project;
import com.codeclan.example.employee_department_lab.repositories.DepartmentRepository;
import com.codeclan.example.employee_department_lab.repositories.EmployeeRepository;
import com.codeclan.example.employee_department_lab.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeDepartmentLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment() {
		Department department = new Department("CodeClan");
		departmentRepository.save(department);

		Employee employee = new Employee("Zack", "Johnson", 1234, department);
		employeeRepository.save(employee);
	}

	@Test
	public void canCreateEmployeeAndProject() {
		Department department = new Department("House");
		departmentRepository.save(department);

		Employee employee = new Employee("John", "Sparrow", 4321, department);
		employeeRepository.save(employee);

		Project project = new Project("CodeClanLab", 90);
		projectRepository.save(project);

		project.addEmployee(employee);
		projectRepository.save(project);
	}

}
