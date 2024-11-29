package com.collections.customobject;

import java.util.ArrayList;
import java.util.List;

class Employee {

    String emp_Name;
    double emp_Salary;

    //Constructor
    public Employee(String emp_Name, double emp_Salary) {
        this.emp_Name = emp_Name;
        this.emp_Salary = emp_Salary;
    }

    @Override
    public String toString() {
        return "Employee [emp_Name=" + emp_Name + ", emp_Salary=" + emp_Salary + "]";
    }
    
}

public class StoringObjectInList {
    
    public static void main(String[] args) {
        
        //Create a List collection to store objects
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Kunja", 105765.12));
        emp.add(new Employee("Gayathri", 10));
        emp.add(new Employee("Dinesh", 5));

        for (Employee employee : emp) {
            
            System.out.println(employee);
        }
    }
}
