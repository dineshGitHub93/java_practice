package com.learn.read_data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class ReadDataUsingGSON {

	@DataProvider
	public Object[][] getDataFromJsonUsingGSON(){
		
		Gson gson = new Gson();
		Type listType = new TypeToken<List<Login>>(){}.getType();
		
		try {
			List<Login> dataList =gson.fromJson(new FileReader("./resources/data/login.json"), listType);
			
			return dataList.stream().map(data ->new Object[] {data})
									.toArray(Object[][]::new);
			
		} catch (JsonIOException | JsonSyntaxException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Object[0][0];
		}
	}
	
	@Test(dataProvider = "getDataFromJsonUsingGSON")
	public void testReadDataFromJSON(Login login) {
		
	}
}
