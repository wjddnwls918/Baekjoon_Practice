import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Ac_1406 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		str = in.readLine();
		int opCnt;
		opCnt = Integer.parseInt(in.readLine());

		Deque<Character> left = new ArrayDeque<>();
		Deque<Character> right = new ArrayDeque<>();
		
		StringBuilder out = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			left.add(str.charAt(i));
		}

		String temp[];
		for (int i = 0; i < opCnt; i++) {
			temp = in.readLine().split(" ");
			if (temp[0].equals("L")) {
				if (left.size() != 0) {
					right.addFirst(left.pollLast());
				}
			} else if (temp[0].equals("D")) {
				if (right.size() != 0) {
					left.addLast(right.pollFirst());
				}
			} else if (temp[0].equals("B")) {

				if (left.size() != 0)
					left.pollLast();

			} else {
				left.addLast(temp[1].charAt(0));
			}
		}
		
		while(!left.isEmpty())
			out.append(left.poll());
		while(!right.isEmpty())
			out.append(right.poll());
		out.append("\n");
		
		System.out.print(out);

	}

}
