package com.lean.esayExcel;

import com.alibaba.excel.annotation.ExcelProperty;

import lombok.Data;

@Data
public class EmployeeData {

	@ExcelProperty("name")
	private String name;
	@ExcelProperty("emp_id")
	private String emp_id;
	@ExcelProperty("mobile_number")
	private Long mobile_number;
	@ExcelProperty("age")
	private Integer age;
	@ExcelProperty("department_name")
	private String department_name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public Long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(Long mobile_number) {
		this.mobile_number = mobile_number;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	
	
}
