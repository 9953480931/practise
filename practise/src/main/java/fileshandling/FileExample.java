 package fileshandling;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) throws IOException {
		
		File file = new File("hell.txt");
		file.createNewFile();
		System.out.println(file.getName().substring(0, file.getName().lastIndexOf('.')));;
	
}
}
