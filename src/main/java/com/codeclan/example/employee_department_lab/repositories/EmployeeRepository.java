package com.codeclan.example.employee_department_lab.repositories;

import com.codeclan.example.employee_department_lab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
