package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		try {
			FileReader reader=new FileReader("hello.txt");
			Scanner scan=new Scanner(reader);
			
			while(scan.hasNext()) {
			String str=scan.nextLine();
			System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
