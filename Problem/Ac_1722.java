import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1722 {

	static int N;
	static int k;
	static int arr[];
	static int permu[];
	static int check[];

	static int op;
	static int cnt;

	static boolean isEnd;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(in.readLine());

		String input[];
		input = in.readLine().split(" ");

		op = Integer.parseInt(input[0]);

		if (op == 1) {
			k = Integer.parseInt(input[1]);
		} else {

			arr = new int[N + 1];
			for (int i = 1; i < input.length; i++) {
				arr[i] = Integer.parseInt(input[i]);
			}
		}

		permu = new int[N + 1];
		check = new int[N + 1];
		cnt = 0;
		isEnd = false;
		for (int i = 1; i <= N; i++) {
			check[i] = 1;
			permu[1] = i;
			find(2);
			permu[1] = 0;
			check[i] = 0;
		}

	}

	public static void find(int depth) {

		if (isEnd)
			return;

		if (depth == N + 1) {
			cnt += 1;

			if (op == 1) {

				if (cnt == k) {
					for (int i = 1; i < permu.length; i++) {
						System.out.print(permu[i]);
						if (i == permu.length - 1) {
							System.out.println();
						} else {
							System.out.print(" ");
						}
					}

					isEnd = true;
				}

				return;

			} else {

				boolean isSame = true;
				for (int i = 1; i <= N; i++) {
					if (permu[i] != arr[i]) {
						isSame = false;
						break;
					}
				}

				if (isSame) {
					System.out.println(cnt);
					isEnd = true;
				}

			}

		} else {

			for (int i = 1; i <= N; i++) {
				if (check[i] != 1) {
					check[i] = 1;
					permu[depth] = i;
					find(depth + 1);
					permu[depth] = 0;
					check[i] = 0;
				}
			}

		}

	}

}

//시간초과
