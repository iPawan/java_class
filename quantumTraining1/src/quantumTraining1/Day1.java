package quantumTraining1;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if( !(isValidA() && isValidB()))
			System.out.println("First condition checked!");
		
		
		if( isValidB() || isValidA())
			System.out.println("Fourth condition checked!");
		
		powerOftwo();

	}

	private static void powerOftwo() {
		int num = 2;
		int result =1;
		for(int i=0; i<10; i++) {
			result *= num;
		}
		System.out.println("result "+result);
	}
	
	
	
	
	
	public static boolean isValidA() {
		System.out.println("is Valid A?");
		return false;
	}

	public static boolean isValidB() {
		System.out.println("is Valid B?");
		return true;
	}
}
