package BufferedEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename="ppp.txt";
		try {
			FileWriter filewriter = new FileWriter(filename);
			filewriter.write("Whole new world \n");
			
			BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
			bufferedwriter.write("Hello World \n");
			
			
			bufferedwriter.close();
		}
		catch(IOException ex){
			System.out.println(ex);
			
			
		}
		
		
		
	}

}
