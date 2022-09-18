package MapInterfaces;
import java.util.*;
public class Employee {
	
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	void empDetails() {
		System.out.println("empId-"+empId);
		System.out.println("empName-"+empName);
		System.out.println("email-"+email);
		System.out.println("gender-"+gender);
		System.out.println("salary-"+salary);
		}
}
		class EMployeeDB{
			ArrayList<Employee> a1= new ArrayList<Employee>();
			boolean addEmployee(Employee e)
			{
				a1.add(e);
				return true;
			}
			boolean deleteEmployee(Employee e)
			{
				ListIterator<Employee> i= a1.listIterator();					
				return true;
			}
		}	