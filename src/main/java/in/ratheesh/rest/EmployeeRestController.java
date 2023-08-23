package in.ratheesh.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ratheesh.entity.Employee;
import in.ratheesh.service.EmpService;

@RestController
public class EmployeeRestController {
	
	@Autowired
	private EmpService empService;
	
	@GetMapping("/greet")
	public String welcome() {
		return "Welcome to Employee database";
		
	}
	
	
	@PostMapping("/addEmp")
	public ResponseEntity<String> createEmployee(@RequestBody Employee employee){

		String status= empService.upsert(employee);
		
		return new ResponseEntity<>(status,HttpStatus.CREATED);

}
	@GetMapping("/emp/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Integer id){
		
		Employee emp= empService.getById(id);
		
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
	@DeleteMapping("/emp/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable Integer id){
		
		String status = empService.deleteById(id);
		
		return new ResponseEntity<>(status, HttpStatus.OK);
	}
	
	@GetMapping("/allEmp")
	public ResponseEntity<List<Employee>> getAllEmp(){
		
		List<Employee> emp = empService.getAllEmployee();
		
		return new ResponseEntity<>(emp, HttpStatus.OK);
		
		
		
	}
	@PostMapping("/updateEmp")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee){
		
		String status = empService.upsert(employee);
		
		return new ResponseEntity<>(status, HttpStatus.OK);
		
	}
	
}