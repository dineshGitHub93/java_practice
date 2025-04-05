package com.lean.esayExcel;

import java.nio.file.Path;
import java.util.List;

import com.alibaba.excel.EasyExcel;

public class ReadExcelSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fileName = Path.of(System.getProperty("user.dir")+"\\resources\\employee.xlsx").toString();
		System.out.println(fileName);
		
		List<EmployeeData> employeeData = EasyExcel.read(fileName)
													.head(EmployeeData.class)
													.sheet()
													.doReadSync();
		employeeData.forEach(System.out::println);
		System.out.println(employeeData.get(0)
										.getDepartment_name());

	}

}
