package in.ratheesh.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ratheesh.entity.Employee;

@Service
public interface EmpService {
	
	public String upsert(Employee employee);

	public Employee getById(Integer id);
	public String deleteById(Integer id);
	public List<Employee> getAllEmployee();
}
