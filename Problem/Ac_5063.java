import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5063 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(in.readLine());
		int r, e, c;

		for (int i = 0; i < N; i++) {
			String input[];
			input = in.readLine().split(" ");
			r = Integer.parseInt(input[0]);
			e = Integer.parseInt(input[1]);
			c = Integer.parseInt(input[2]);

			if (r < e - c) {
				System.out.println("advertise");
			} else if (r == e - c) {
				System.out.println("does not matter");
			} else {
				System.out.println("do not advertise");
			}
		}

	}

}
