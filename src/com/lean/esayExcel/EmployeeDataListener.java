package com.lean.esayExcel;

import java.util.ArrayList;
import java.util.List;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.read.listener.ReadListener;

import lombok.Data;
import lombok.Getter;
@Getter
public class EmployeeDataListener implements ReadListener<EmployeeData>{
	
	private final List<EmployeeData> employeeDataList = new ArrayList<EmployeeData>();
	
	public List<EmployeeData> getEmployeeDataList() {
		return employeeDataList;
	}

	@Override
	public void invoke(EmployeeData data, AnalysisContext context) {
		System.out.println("Reading Row"+ data);
		employeeDataList.add(data);
		
	}

	@Override
	public void doAfterAllAnalysed(AnalysisContext context) {
		System.out.println("Finshed reading file from Employee Data Sheet. Total Records :"+employeeDataList.size());
		
	}

}
