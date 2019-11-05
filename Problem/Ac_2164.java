import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Ac_2164 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());

		Queue<Integer> que = new ArrayDeque<>();

		if (N == 1) {
			System.out.println(1);
			return;
		}

		if (N == 2) {
			System.out.println(2);
			return;
		}

		if (N % 2 == 0) {

			for (int i = 2; i <= N; i += 2) {
				que.add(i);
			}
		} else {
			for(int i=4; i<=N; i+=2) {
				que.add(i);
			}
			que.add(2);
		}

		while (true) {

			que.poll();

			if (que.size() == 1) {
				System.out.println(que.poll());
				break;
			}

			int cur = que.poll();
			que.add(cur);

		}

	}

}
