package quantumTraining1;

public class ConsOverload {
	String name, course, technology;

	ConsOverload(String s, String n) {
		name = s;
		course = n;
	}

	ConsOverload(String s, String n, String c) {
		name = s;
		course = n;
		technology = c;
	}

	void show() {
		System.out.println(name + "" + course + "" + technology);
	}

	public static void main(String args[]) {
		ConsOverload ob1 = new ConsOverload("edureka", "Java");
		ConsOverload ob2 = new ConsOverload("edureka", "J2EE", "Java");
		ob1.show();
		ob2.show();
	}
}