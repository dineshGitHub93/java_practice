package com.filehandling.learn;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class SyncMethodFromFB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 // Initializing a FileDescriptor
		FileDescriptor text_dispricptor = null;
		FileOutputStream fos = null;
		
		//arrays that has to be written in file 
		byte[] buffer = {78,5,2,9,4,6,12};
		
		try {
			
			fos = new FileOutputStream("File.txt");
			
			 // This getFD() method is called before closing the output stream
			text_dispricptor = fos.getFD();
			
			 // writes byte to file output stream
			fos.write(buffer);
			
			  // USe of sync() : to sync data to the source file
			text_dispricptor.sync();
			 System.out.print("\nUse of Sync Successful ");
		}
		catch (Exception e) {
			System.out.println("Exception occured : "+ e.getMessage());
		}
		finally {
			
			if(fos != null )
				fos.close();
		}
	}

}
