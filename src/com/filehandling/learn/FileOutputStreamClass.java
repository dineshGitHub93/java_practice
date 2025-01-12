package com.filehandling.learn;

import java.io.FileOutputStream;

public class FileOutputStreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String txt = "Write file using fileOutputStream class \n Happy to learn file concept";
		
		FileOutputStream outputStream = null;
		
		try 
		{
			byte[] filecontent = txt.getBytes();
			
			outputStream = new FileOutputStream("Hello1.txt");
			
			outputStream.write(filecontent);
			
			System.out.println("File written has been successfully");
		}
		catch (Exception e) {
			System.out.println("Exception occured : "+e.getMessage());
		}

		finally {
			
			if(outputStream != null) {
				
				try {
					
					outputStream.close();
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}
