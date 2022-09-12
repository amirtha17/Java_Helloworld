import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEmployeeDetails 
{

	EmployeeDetails employee = new EmployeeDetails();
	@Test
	public void testCalculateYearlySalary() {
	      employee.setName("Raj");
	      employee.setAge(25);
	      employee.setMonthlySalary(8000);
			
	      double result = employee.calculateYearlySalary(employee);
	      assertEquals(96000, result, 0.0);
	   }
}
