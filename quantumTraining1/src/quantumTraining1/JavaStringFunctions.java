package quantumTraining1;

public class JavaStringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subString();
	}
	
	public static void subString() {
		String s1 = "Thisis USA";
		//01234
		System.out.println(s1.substring(1,4));
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Edureka ");
		sb.append("Learning ");
		sb.append("Quantum");
		
		System.out.println(sb.toString());
		
		
		
		 String name = "Edureka";  
		   String str = name.concat(" Learning"); //concat() method appends the string at the end  
		   System.out.println(str);
	}

}
