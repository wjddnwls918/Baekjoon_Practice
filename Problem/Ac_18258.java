import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Ac_18258 {

	static int N;
	static BufferedReader in;
	static StringBuilder out;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new StringBuilder();
		N = Integer.parseInt(in.readLine());

		solve();

		System.out.println(out);
	}

	public static void solve() throws Exception {

		String input[];

		Deque<Integer> que = new ArrayDeque();

		for (int i = 0; i < N; i++) {
			input = in.readLine().split(" ");

			if (input[0].equals("push")) {
				que.add(Integer.parseInt(input[1]));
			} else if (input[0].equals("pop")) {
				if (que.isEmpty())
					out.append("-1\n");
				else
					out.append(que.poll() + "\n");
			} else if (input[0].equals("size")) {
				out.append(que.size() + "\n");
			} else if (input[0].equals("empty")) {
				if (que.isEmpty())
					out.append("1\n");
				else
					out.append("0\n");
			} else if (input[0].equals("front")) {
				if (que.isEmpty())
					out.append("-1\n");
				else
					out.append(que.peekFirst() + "\n");
			} else {
				if (que.isEmpty())
					out.append("-1\n");
				else
					out.append(que.peekLast() + "\n");
			}

		}
	}

}
