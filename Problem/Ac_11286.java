import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Ac_11286 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				if (Math.abs(arg0) > Math.abs(arg1)) {
					return 1;
				} else if (Math.abs(arg0) == Math.abs(arg1)) {
					if (arg0 > arg1)
						return 1;
					else
						return -1;
				} else {
					return -1;
				}
			}
		});

		int N = Integer.parseInt(in.readLine());

		for (int i = 0; i < N; i++) {

			int cur = Integer.parseInt(in.readLine());

			if (cur != 0) {
				que.add(cur);
			} else {
				if (que.isEmpty()) {
					out.append("0\n");
				} else {
					out.append(que.poll() + "\n");
				}
			}

		}

		System.out.println(out);

	}

}
