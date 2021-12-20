
public class What1 {

	static int[] a(int a[]) {
		int b[] = { a[0], a[0] };

		for (int i = 0; i < a.length; i++) {
			if (b[0] > a[i]) {
				b[0] = a[i];
			}
			if (b[1] < a[i]) {
				b[1] = a[i];
			}
		}

		return b;
	}

	public static void main(String args[]) {
		System.out.println(What0.d(a(new int[] { 7, 33, 9, 14, 11, 5 })));
	}
}
