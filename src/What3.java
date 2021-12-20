
public class What3 {

	static int[] a(int a, int b) {
		int c[] = new int[b];
		c[0] = 1;
		for (int i = 1 ; i < c.length; i++) {
			c[i] = a*c[i-1];	
		}
			
		return c;
	}
	
	public static void main(String args[]) {
		System.out.println(What0.d(a(-2,16)));
	}
}
