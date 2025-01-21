package com.apachePOI.learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateBlankSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a blank workbook
		Workbook workbook = new XSSFWorkbook();

		//Create a fileSystem using specific name
		try {

			FileOutputStream out = new FileOutputStream(
					new File("CreateBlankSheet.xlsx"));

			//Write operations workbook using file out object 
			workbook.write(out);

			System.out.close();
			System.out.println("createworkbook.xlsx written successfully");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			System.out.println("IO Exception "+e.getMessage());
		}
	}

}
