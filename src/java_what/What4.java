package java_what;

public class What4 {

	static int[][] a(int a, int b) {
		int c[][] = new int[a][b];
		
		for (int d = 0 ; d < c.length; d++) {
			for (int e = 0 ; e < c.length; e++) {
				c[d][e] = (d+1)*(e+1);
			}
		}
			
		return c;
	}
	
	public static void main(String args[]) {
		System.out.println(What0.d(a(12,12)));
	}
}
