import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ac_1874 {

	static BufferedReader in;
	static StringBuilder out;
	static int N;
	static String sequence = "";

	static Stack<Integer> stk;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		in = new BufferedReader(new InputStreamReader(System.in));
		out = new StringBuilder();

		initInput();

		solve();

		if (stk.isEmpty()) {
			System.out.println(out);
		} else {
			System.out.println("NO");
		}

	}

	public static void initInput() throws Exception {
		N = Integer.parseInt(in.readLine());

		for (int i = 0; i < N; i++) {
			sequence += in.readLine();
		}

	}

	public static void solve() throws Exception {

		stk = new Stack<>();

		int numberPointer = 1;

		for (int i = 0; i < N; i++) {

			int cur = Integer.parseInt(sequence.charAt(i) + "");

			System.out.println(cur);

			while (true) {

				if (stk.isEmpty()) {
					System.out.println("+");
					stk.add(numberPointer);
					numberPointer++;
				}

				if (stk.peek() == cur) {
					stk.pop();
					System.out.println("-");
					numberPointer++;
					break;
				} else {

					stk.add(numberPointer);
					System.out.println("+");
					numberPointer++;

				}

				if (numberPointer > N)
					break;

			}

		}

	}

}
