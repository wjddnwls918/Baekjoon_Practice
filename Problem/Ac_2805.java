import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_2805 {

	static int N, M;
	static int num[];
	static long result;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String input[];
		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);

		int max = 0;
		num = new int[N];
		input = in.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(input[i]);
			if (max < num[i])
				max = num[i];
		}

		Arrays.sort(num);

		findBinarySearchHeight(1, max);

		System.out.println(result);

	}

	public static void findBinarySearchHeight(long left, long right) {

		while (left <= right) {

			long mid = (left + right) / 2;
			
			if (isOk(mid)) {
				result = Math.max(result, mid);
				left = mid + 1;
			} else
				right = mid - 1;

		}

	}

	public static boolean isOk(long height) {

		long treeH = 0;

		for (int j = N - 1; j >= 0; j--) {
			if (num[j] < height) {
				break;
			}

			treeH += Math.abs(num[j] - height);
		}

		if (treeH >= M) {			
			return true;
		} else
			return false;

	}

}

//높이값 이분탐색 
