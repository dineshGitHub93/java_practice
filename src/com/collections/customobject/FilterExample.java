package com.collections.customobject;

import java.util.ArrayList;
import java.util.List;

class Student {

    String name;
    double grade;

    //constructor
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", grade=" + grade + "]";
    }
    
}
public class FilterExample {

    public static void main(String[] args) {
        
        List<Student> student = new ArrayList<>();

        student.add(new Student("AAA", 70.89));
        student.add(new Student("BBB", 87.65));
        student.add(new Student("CCC", 69.86));
        student.add(new Student("DDD", 55.91));

        for (Student student2 : student) {
            
            if (student2.grade > 80) {
                
                System.out.println(student2);
            }
        }
    }
    
}
