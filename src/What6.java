
public class What6 {

	static int[] a(int a[], int b) {
		int c[] = new int[b];
		int d = a.length < c.length ? a.length : c.length;

		for (int e = 0; e < d; e++) {
			c[e] = a[e];
		}

		return c;
	}

	public static void main(String args[]) {
		System.out.println(What0.d(a(new int[] { 33, 7, 12 }, 5)));
		System.out.println(What0.d(a(new int[] { 33, 7, 12 }, 2)));
	}
}
