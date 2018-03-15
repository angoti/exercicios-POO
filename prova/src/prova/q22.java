package prova;

class Test {
	int a, b;

	Test(int i, int j) {
		a = i;
		b = j;
	}

	void meth(Test o) {
		o.a *= 2;
		o.b /= 2;
	}
}

public class q22 {
	public static void main(String args[]) {
		Test obj = new Test(10, 20);
		obj.meth(obj);
		System.out.println(obj.a + " " + obj.b);
	}
}
