package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileManagement {
	
	public static void main(String[] args) {
		FileOutputStream outputStream=null;
		
		try {
			outputStream=new FileOutputStream("file2.txt",true);
			String contents="This is another File";
			for(int ch:contents.toCharArray()) {
				outputStream.write(ch);
			}
			
		} catch (IOException e) {
			System.err.println("File Not Found");
		}
		
	finally {
		try {
			outputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}

}
