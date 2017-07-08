package inherirance;

class Mammal {
	public Mammal() {
		System.out.println("default constructor");
	}

	public Mammal(int age) {
		System.out.print("Mammal");
	}
}

public class Platypus extends Mammal {
	public Platypus() {
		super(1);
		System.out.print("Platypus");
	}

	public static void main(String[] args) {
		new Mammal(5);
	}
}
