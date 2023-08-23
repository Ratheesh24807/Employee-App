package in.ratheesh.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ratheesh.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable>{

	// adding comment just to check the git stash command
}
