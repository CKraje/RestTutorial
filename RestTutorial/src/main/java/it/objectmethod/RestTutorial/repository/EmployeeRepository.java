package it.objectmethod.RestTutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.objectmethod.RestTutorial.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
