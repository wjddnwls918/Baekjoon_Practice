import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1934 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		int T = Integer.parseInt(in.readLine());
		int A, B;
		String input[];

		for (int tc = 1; tc <= T; tc++) {

			input = in.readLine().split(" ");
			A = Integer.parseInt(input[0]);
			B = Integer.parseInt(input[1]);

			int small = A > B ? B : A;

			int G = 1;
			for (int i = small; i >= 0; i--) {
				if (A % i == 0 && B % i == 0) {
					G = i;
					break;
				}
			}

			out.append(G * (A / G) * (B / G) + "\n");
		}

		System.out.println(out);

	}

}
