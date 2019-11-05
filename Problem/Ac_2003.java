import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2003 {

	static long mem[] = new long[10001];
	static int result;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = in.readLine().split(" ");
		int N, M;
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);

		int num[] = new int[N];
		input = in.readLine().split(" ");
		long sum = 0;
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(input[i]);
			if (num[i] == M)
				result += 1;
			sum += num[i];
			mem[i] = sum;
		}

		/*
		 * for(int i=0; i<N; i++) System.out.println(mem[i]);
		 */
		for (int i = 2; i <= N; i++) {

			// 1개부터 N개까지

			for (int j = 0; j <= N - i; j++) {
				// 0번 인덱스부터

				long cur;
				if (j - 1 < 0) {
					cur = mem[j + i - 1];
				} else {
					cur = mem[j + i - 1] - mem[j - 1];
				}

				//System.out.println("i : " + i + " j : " + j + " cur : " + cur);

				if (cur == M)
					result += 1;

			}
		}

		System.out.println(result);

	}

}
