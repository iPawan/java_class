package quantumTraining1;

class Parent {
	 public void fun() {
		 System.out.println("Bye");
		// display();
	 };
	
}

public class CLSInheritance extends Parent {
	
	public static void main(String[] args) {
		CLSInheritance s = new CLSInheritance();
		s.display();
		s.fun();
	}
	
	public static Parent getparent() {
		
		return new CLSInheritance();
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
	public void fun(int a) {
		
	}
	
	 void display() {
			 System.out.println("HOrray!!!");
		 }

}

 class Test extends CLSInheritance{
	 
	 public void test() {
		 this.display();
	 }
	
}
