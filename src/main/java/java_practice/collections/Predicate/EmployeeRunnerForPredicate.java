package java_practice.collections.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeRunnerForPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employee = new ArrayList<Employee>();
		
		employee.add(new Employee("Dinesh", "Development", 150000, 10));
		employee.add(new Employee("Raj", "Admin", 45000, 4));
		employee.add(new Employee("Sathish", "QA", 95000, 11));
		employee.add(new Employee("Naveen", "QA", 47000, 8));
		employee.add(new Employee("Kumaran", "Development", 130000, 9));
		employee.add(new Employee("Kunja", "Development", 180000, 6));
		employee.add(new Employee("Vinoth", "IT Support", 55000, 7));
		employee.add(new Employee("Vishal", "Admin", 65000, 8));
		employee.add(new Employee("Vimal", "IT Support", 75000, 12));
		
		
		//Predicate for employees with salary greater than 50,0000
		Predicate<Employee> salaryCheck = emp -> emp.getSalary() >50000;
		
		//Predicate for employees working in the Development
		Predicate<Employee> deptCheck = emp -> emp.getDepartment().equalsIgnoreCase("Admin");
		
		//Predicate for employees with more than 5 years of experience
		Predicate<Employee> experienceCheck = emp ->emp.getYearsOfExperience()>=5;
		
		
		// Filter employees based on salary
		List<Employee> highSalaryEmployee = employee.stream().filter(salaryCheck)
															.collect(Collectors.toList());
		
		System.out.println("Employees with Salary greater than 50000 \n");
		highSalaryEmployee.forEach(System.out::println);
		
		// Filter employees based on Development Department
		List<Employee> developmentDepartment = employee.stream().filter(deptCheck)
																.collect(Collectors.toList());
		System.out.println("Employees working in the development \n");
		developmentDepartment.forEach(System.out::println);
		
		//Filter employee based on 5 and more years of experience 
		List<Employee> greater5yearsEmployee = employee.stream().filter(experienceCheck)
																.collect(Collectors.toList());
		System.out.println("Employee with 5+ years of experince");
		greater5yearsEmployee.forEach(System.out::println);
		
		// Filter Employee working as Admin with 5+ years of experience
		List<Employee> adminWith5YearsOfExperience = employee.stream().filter(deptCheck.and(experienceCheck))
																		.collect(Collectors.toList());
		
		System.out.println("Employee working as an admin with 5+ years of experince");
		adminWith5YearsOfExperience.forEach(System.out::println);
		

	}

}
