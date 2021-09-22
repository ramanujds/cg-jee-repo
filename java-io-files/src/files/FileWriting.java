package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileWriting {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream inputStream=new FileInputStream("hello.txt");
			int ch;
			while((ch=inputStream.read())!=-1) {
				System.out.print((char)ch);
			}
			
			
		} catch (IOException e) {
			System.err.println("File Not Found");
		}
		
	}

}
