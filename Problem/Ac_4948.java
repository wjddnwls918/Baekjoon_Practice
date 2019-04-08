import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_4948 {

	static int isPrime[];
	static final int MAX = 300000;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		isPrime = new int[MAX+1];

		Arrays.fill(isPrime, 1);
		isPrime[0] = 0;
		isPrime[1] = 0;

		for (int i = 2; i <= Math.sqrt(MAX); i++) {
			if (isPrime[i] != 1)
				continue;
			for (int j = 2 * i; j <= MAX; j += i)
				isPrime[j] = 0;
		}

		int n;
		while (true) {
			n = Integer.parseInt(in.readLine());
			if (n == 0)
				break;

			System.out.println(findPrimeCnt(n));
		}

	}

	public static int findPrimeCnt(int n) {
		int result = 0;
		int size = 2 * n;
		if (size > MAX)
			size = MAX;
		for (int i = n + 1; i <= size; i++) {
			if (isPrime[i] == 1)
				result += 1;
		}

		return result;
	}

}
