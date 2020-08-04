package com.codeclan.example.employee_department_lab.repositories;

import com.codeclan.example.employee_department_lab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
