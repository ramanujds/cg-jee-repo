package files;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {
		FileWriter fileWriter=null;
		try {
			fileWriter=new FileWriter("file2.txt",true);
			fileWriter.write("\nHello All.. How are you?");
			
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}
		
		finally {
			try{
				fileWriter.close();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

}
