package BufferedEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String filename="pawanrao.txt";

String line = null;

try {
	FileReader filereader = new FileReader(filename);
	
	BufferedReader bufferedreader = new BufferedReader(filereader);
	
	while((line =bufferedreader.readLine())  != null){
		System.out.println(line);
	}
	bufferedreader.readLine();
	bufferedreader.close();
	
}
catch(FileNotFoundException ex) {
	System.out.println(ex);
}
	catch(IOException ex)	{
		System.out.println(ex);
	}
		
		
	}

}
