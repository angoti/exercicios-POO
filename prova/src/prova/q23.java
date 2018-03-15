package prova;

class AA {
	int i;
	void display() {
		System.out.println(i);
	}
}

class BB extends AA {
	int j;
	void display() {
		System.out.println(j);
	}
}

class inheritance_demo {}

public class q23 {
	public static void main(String args[]) {
		BB obj = new BB();
		obj.i = 1;
		obj.j = 2;
		obj.display();
	}
}
