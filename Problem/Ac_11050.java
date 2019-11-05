import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_11050 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = in.readLine().split(" ");
		int N, K;
		N = Integer.parseInt(input[0]);
		K = Integer.parseInt(input[1]);

		long mem[] = new long[11];

		mem[0] = 1;
		for (int i = 1; i < mem.length; i++) {
			mem[i] = calFac(i);			
		}

		System.out.println(mem[N] / (mem[N - K] * mem[K]));
	}

	public static long calFac(int n) {
		long result = 1;
		for (int i = n; i >= 1; i--) {
			result *= i;
		}
		
		return result;
	}

}
