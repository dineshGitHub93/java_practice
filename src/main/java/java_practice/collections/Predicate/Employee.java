package java_practice.collections.Predicate;

public class Employee {

	//Variable declaration for Employee
	private String name;
	private String department;
	private double salary;
	private int yearsOfExperience;
	
	//Constructor
	public Employee(String name, String department, double salary, int yearsOfExp) {
		
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.yearsOfExperience = yearsOfExp;
	}

	// Getters 
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	@Override
	public String toString() {
		return "Employee [getName()=" + getName() + ", getDepartment()=" + getDepartment() + ", getSalary()="
				+ getSalary() + ", getYearsOfExperience()=" + getYearsOfExperience() + "]";
	}
	
}
