import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2446 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		int N = Integer.parseInt(in.readLine());

		int start = 0;
		int count = 2 * (N - start) - 1;

		for (int i = 0; i < 2 * N - 1; i++) {
			for (int j = 0; j < 2 * N - 1; j++) {

				if (j == start) {
					for (int k = 0; k < count; k++) {
						out.append("*");
					}

					out.append("\n");

					break;
				} else {
					out.append(" ");
				}
			}

			if (i < N - 1) {
				start += 1;
			} else
				start -= 1;

			count = 2 * (N - start) - 1;

		}
		
		System.out.println(out);

	}

}
