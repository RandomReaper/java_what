
public class What2 {

	static int[] a(int a, int b) {
		int c[] = new int[b - a + 1];

		for (int i = 0; i < c.length; i++) {
			c[i] = a + i;
		}

		return c;
	}

	public static void main(String args[]) {
		System.out.println(What0.d(a(-2, 16)));
	}
}
