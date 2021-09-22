package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileNIO {

	public static void main(String[] args) {
		
		try {
			
			List<String> lines= Files.lines(Paths.get("hello.txt"))
					.filter(line->line.length()>20)
					
					.collect(Collectors.toList());
			
			System.out.println(lines);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
