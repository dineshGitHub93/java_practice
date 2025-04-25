package com.learn.read_data;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class readDataFromJson {

	@DataProvider
	public Object[][] getDataFromJSON(){
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			List<Login> dataset = mapper.readValue(new File("./resources/data/login.json"), 
							 new TypeReference<List<Login>>() {
							});
		return	dataset.stream().map(data -> new Object[] {data})
					.toArray(Object[][]::new );
		} catch (IOException e) {
			e.printStackTrace();
			return new Object[0][0];
		}
		
	}
	
	@Test(dataProvider = "getDataFromJSON")
	public void testReadDataFromJSON(Login login) {
		
	}
}
