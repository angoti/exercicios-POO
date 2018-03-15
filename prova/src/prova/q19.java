package prova;

interface Livestock {}

abstract class Bird implements Livestock {
}

class Chicken extends Bird {
}

public class q19 {
	public static void main(String[] args) {
		// a)
		Bird bird = new Chicken();
		// b)
		Livestock livestock = new Chicken();
		// c)
		Bird bird = new Bird();

	}
}
