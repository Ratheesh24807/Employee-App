package in.ratheesh;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import in.ratheesh.entity.Employee;
import in.ratheesh.repository.EmployeeRepository;

@SpringBootTest
class EmployeeAppApplicationTests {
	
	@Autowired
	private EmployeeRepository eRepo;

	@Test
	public void create() {
		Employee e = new Employee();
		e.setId(2);
		e.setGender("Male");
		e.setName("Rama");
		e.setContactno(123);
		eRepo.save(e);
		assertNull(eRepo.findById(2).get());
		
		
		
	}

}
