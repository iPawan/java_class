package quantumTraining1;

public class AccessModi {
	public static void main(String[] args) {
		String s1 = "    Hello how are you?    ";
		//s1 = s1.trim();
		System.out.println(s1);
		checkName("   john   ");
	}
	
	public static void checkName(String name) {
		
		if(name.trim().equalsIgnoreCase("John")){
			System.out.println("it is equal");
		}else {
		System.out.println("it is not equal");
		}

	}
// int - 20 String "20", boolean true , string "true"
}
