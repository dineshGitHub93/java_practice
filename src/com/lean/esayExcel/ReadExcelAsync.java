package com.lean.esayExcel;

import java.nio.file.Path;

import com.alibaba.excel.EasyExcel;

public class ReadExcelAsync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long begin = System.currentTimeMillis();
		
		String fileName = Path.of(System.getProperty("user.dir")+"\\resources\\employee.xlsx").toString();
		//System.out.println(fileName);
		
		EmployeeDataListener employeeDataListener = new EmployeeDataListener();
		EasyExcel.read(fileName, EmployeeData.class, employeeDataListener)
					.sheet()
					.doRead();
		String email = employeeDataListener.getEmployeeDataList()
						.get(0).getName();
		System.out.println(email);
		
		long end = System.currentTimeMillis();
		long totalTime = end - begin;
		System.out.println("Total time taken to run the program(in millis)"+totalTime);
	}

}
