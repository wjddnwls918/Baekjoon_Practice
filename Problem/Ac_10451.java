import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10451 {

	static int N;
	static int arr[];
	static boolean isVisit[];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());

		String input[];

		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(in.readLine());

			arr = new int[N];

			input = in.readLine().split(" ");
			for (int i = 0; i < N; i++) {
				int cur = Integer.parseInt(input[i])-1;

				arr[i] = cur;
			}

			int count = 0;
			isVisit = new boolean[N];

			for (int i = 0; i < N; i++) {

				if (arr[i] != 0) {
					
					count++;
					
					int curPnt = arr[i];
					arr[i] = 0;

					
					while (true) {

						boolean isOut = true;

						if (arr[curPnt] != 0) {
							int pre = curPnt;
							curPnt = arr[curPnt];
							arr[pre] = 0;
							arr[curPnt] = 0;
							isOut = false;
						}
						
						if (isOut)
							break;
					}

					if (isEnd()) {
						break;
					}

					

				}

			}

			System.out.println(count);

		}
	}

	public static boolean isEnd() {

		for (int i = 0; i < N; i++) {
			if (!isVisit[i])
				return false;
		}

		return true;
	}

}
