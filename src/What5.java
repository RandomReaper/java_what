
public class What5 {

	static int[] a(int a[], int b[]) {
		int c[] = new int[a.length + b.length];

		for (int d = 0; d < a.length; d++) {
			c[d] = a[d];
		}

		for (int d = 0; d < b.length; d++) {
			c[d + a.length] = b[d];
		}

		return c;
	}

	public static void main(String args[]) {
		System.out.println(What0.d(a(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 })));
	}
}
