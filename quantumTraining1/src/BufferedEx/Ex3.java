package BufferedEx;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String filename ="pawanrao.txt";
 
 
try {
	FileWriter filewriter = new FileWriter(filename);
	
	BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
	
	bufferedwriter.write("WashingtonDC\n");
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter username");
	String username =sc.nextLine();
	
	bufferedwriter.write(username);
	bufferedwriter.newLine();
	
	System.out.println("location");
	String location= sc.nextLine();
	bufferedwriter.write(location);
	
	bufferedwriter.newLine();
	
	System.out.println("Age ");
	int age =sc.nextInt();
	bufferedwriter.write(Integer.toString(age));
	
	
	System.out.println("Enteruser: \n " +username);
	System.out.println("Enteruser: \n " +location);
	System.out.println("Enteruser: \n" +age);
	
	
	
	bufferedwriter.newLine();
	
	bufferedwriter.close();
}
catch(Exception ex) {
	System.out.println(ex);
	
}
	}

}
