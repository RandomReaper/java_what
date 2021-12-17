package java_what;

public class What0 {
	public static String d(int[] a) {
		String b = "int array(";
		for (int i = 0; i < a.length; i++) {
			b += a[i];
			if (i != a.length - 1) {
				b += ',';
			}
		}
		return b + ')';
	}

	public static String d(int[][] a) {
		String b = "int array(\n";
		for (int c = 0; c < a.length; c++) {
			b += "\t(";
			for (int d = 0; d < a.length; d++) {
				b += a[c][d];
				if (d != a.length - 1) {
					b += "\t";
				}
			}
			b += ")\n";
		}
		return b + ")";
	}

	public static void main(String args[]) {
		System.out.println(d(new int[] {}));
		System.out.println(d(new int[] { 1, 2, 3, 4 }));
	}
}
