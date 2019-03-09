import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Ac_10866 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());

		String op[];
		Deque<Integer> deque = new ArrayDeque<>();
		for (int i = 0; i < N; i++) {
			op = in.readLine().split(" ");

			if (op[0].equals("push_front")) {
				deque.addFirst(Integer.parseInt(op[1]));
			} else if (op[0].equals("push_back")) {
				deque.addLast(Integer.parseInt(op[1]));
			} else if (op[0].equals("pop_front")) {
				if (deque.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(deque.pollFirst());
				}
			} else if (op[0].equals("pop_back")) {
				if (deque.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(deque.pollLast());
				}
			} else if (op[0].equals("size")) {
				System.out.println(deque.size());
			} else if (op[0].equals("empty")) {
				if(deque.isEmpty())
					System.out.println(1);
				else
					System.out.println(0);
			} else if (op[0].equals("front")) {
				if (deque.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(deque.peekFirst());
				}
			} else if (op[0].equals("back")) {
				if (deque.isEmpty()) {
					System.out.println(-1);
				} else {
					System.out.println(deque.peekLast());
				}
			}

		}
	}

}
