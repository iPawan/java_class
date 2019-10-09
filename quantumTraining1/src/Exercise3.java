import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String filename="JavaCourse.txt";
		try {
			FileWriter filewriter = new FileWriter(filename);
			filewriter.write("quantum Technology");
			
			BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
			bufferedwriter.write("Hello friends ");
			
			//BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
			bufferedwriter.write("Hello sami ");
			
			//BufferedWriter bufferedwriter2 = new BufferedWriter(filewriter);
			bufferedwriter.write("Hello sultan ");
			
			//BufferedWriter bufferedwriter3 = new BufferedWriter(filewriter);
			bufferedwriter.write("Hello Ashir ");
			
			
			
			bufferedwriter.close();
			//bufferedwriter1.close();
			//bufferedwriter2.close();
			//bufferedwriter3.close();
			
		}
		catch(IOException ex){
			System.out.println(ex);
			
			
		}
		
		
		
	}
}
