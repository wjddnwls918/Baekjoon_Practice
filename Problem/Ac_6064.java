import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_6064 {

	static int M, N, x, y;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String input[];
			input = in.readLine().split(" ");
			M = Integer.parseInt(input[0]);
			N = Integer.parseInt(input[1]);
			x = Integer.parseInt(input[2]);
			y = Integer.parseInt(input[3]);

			if (M < x || N <y) {
				System.out.println(-1);
			} else if (x== y) {
				System.out.println(x);				
			}
			else	{
			

				int maxVal = M > N ? M : N;


				int init;
				boolean isOk = false;
				int year;
				if (maxVal == M) {
					init = M + x;
					year = findVal(init, M);
				} else {
					init = N + y;
					year = findVal(init, N);
				}

				if (year != -1)
					System.out.println(year);
				else
					System.out.println(-1);
			}
		}

	}

	public static int findVal(int init, int interval) {

		while (true) {

			init += interval;
			
			//System.out.println(init);

			if (init > M * N) {
				break;
			}

			if ( (init % M == x && init % N == y) || ( (M*N) / N == x && (M*N) / M == y)) {
				return init;
			}

		}

		return -1;
	}

}
