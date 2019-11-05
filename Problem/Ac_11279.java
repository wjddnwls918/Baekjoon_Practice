import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Ac_11279 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		int N = Integer.parseInt(in.readLine());

		PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				if (arg0 < arg1) {
					return 1;
				} else {
					return -1;
				}
			}
		});

		for (int i = 0; i < N; i++) {
			int command = Integer.parseInt(in.readLine());

			if (command == 0) {
				if (que.isEmpty()) {
					out.append(0 + "\n");
				} else {
					out.append(que.poll() + "\n");
				}
			} else {
				que.add(command);
			}
		}

		System.out.println(out);

	}

}
