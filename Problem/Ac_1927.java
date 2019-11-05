import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Ac_1927 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());

		PriorityQueue<Integer> que = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {

			int num = Integer.parseInt(in.readLine());

			if (num == 0) {
				if (que.isEmpty()) {
					System.out.println(0);
				} else
					System.out.println(que.poll());
			} else {
				que.add(num);
			}

		}

	}

}
