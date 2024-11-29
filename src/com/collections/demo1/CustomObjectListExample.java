package com.collections.demo1;

import java.util.ArrayList;
import java.util.List;

class Student {

    String name;
    int age;
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}

public class CustomObjectListExample {
    
    public static void main(String[] args) {
        
        List<Student> student = new ArrayList<>();
        
        student.add(new Student("Kunja", 1));
        student.add(new Student("Dinesh", 31));
        student.add(new Student("Gayathri", 30));

        for (Student student2 : student) {

            System.out.println(student2);
        }
    }
}
