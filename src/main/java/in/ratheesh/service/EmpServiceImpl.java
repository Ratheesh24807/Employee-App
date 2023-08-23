package in.ratheesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ratheesh.entity.Employee;
import in.ratheesh.repository.EmployeeRepository;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public String upsert(Employee employee) {
		empRepo.save(employee);
		return "Success";
	}

	@Override
	public Employee getById(Integer id) {
		Optional<Employee> findEmp= empRepo.findById(id);
		if(findEmp.isPresent()) {
			return findEmp.get();
		}
		
		return null;
	}

	@Override
	public String deleteById(Integer id) {
		if(empRepo.existsById(id)) {
			empRepo.deleteById(id);
			return "Delete success";
		}else {
			
		}return "Record not found";
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return empRepo.findAll();
	}
	

}
