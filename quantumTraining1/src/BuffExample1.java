import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffExample1 {

	public static void main(String[] args ) throws IOException {
		// TODO Auto-generated method stub
		
		try {
		InputStreamReader i = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(i);
		String Course ="";
		Object name = null;
		while(!name.equals("stop")){
			System.out.println("Enter course:");
			Course =b.readLine();
			System.out.println("course is: " +Course);
		}
		b.close();
		i.close();
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
		

	}
}

