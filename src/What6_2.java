
public class What6_2 {

	static int[] a(int a[], int b) {
		int c[] = new int[b];
		int d = 0;

		while (d < a.length && d < c.length) {
			c[d] = a[d];
			d++;
		}
		return c;
	}

	public static void main(String args[]) {
		System.out.println(What0.d(a(new int[] { 33, 7, 12 }, 5)));
		System.out.println(What0.d(a(new int[] { 33, 7, 12 }, 2)));
	}
}
