package prova;

class AAA {
	int i;

	public void display() {
		System.out.println(i);
	}
}

class BBB extends AAA {
	int j;

	public void display() {
		System.out.println(j);
	}
}

class Dynamic_dispatch {
}

public class q25 {
	public static void main(String args[]) {
		BBB obj2 = new BBB();
		obj2.i = 1;
		obj2.j = 2;
		AAA r;
		r = obj2;
		r.display();
	}
}
