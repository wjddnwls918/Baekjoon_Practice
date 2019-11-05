import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2581 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(in.readLine());
		int N = Integer.parseInt(in.readLine());

		boolean notPrime[] = new boolean[10001];

		notPrime[0] = true;
		notPrime[1] = true;
		for (int i = 2; i <= Math.sqrt(10000); i++) {

			if (!notPrime[i]) {
				for (int j = i + i; j <= 10000; j += i) {
					notPrime[j] = true;
				}
			}
		}

		long sum = 0;
		int min = 0;
		for (int i = M; i <= N; i++) {

			if (!notPrime[i]) {

				sum += i;

				if (min == 0) {
					min = i;
				}
			}

		}

		if (sum == 0) {
			System.out.println(-1);
		} else {

			System.out.println(sum);
			System.out.println(min);

		}

	}

}
