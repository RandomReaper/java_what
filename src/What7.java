
public class What7 {

	public static String a(int n) {
		String out = "";

		for (int line = 0; line < n; line++) {

			for (int i = 0; i < n - line - 1; i++) {
				out += ' ';
			}

			for (int d = 0; d < 2 * line + 1; d++) {
				out += '*';
			}

			out += '\n';
		}

		return out;
	}

	public static void main(String args[]) {
		System.out.println(a(5));
	}
}
