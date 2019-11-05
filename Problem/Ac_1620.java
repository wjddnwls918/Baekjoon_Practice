import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Ac_1620 {

	static HashMap<String, Integer> map;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N, M;
		String input[];
		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);

		map = new HashMap<>();
		for (int i = 1; i <= N; i++) {
			String str = in.readLine();
			map.put(str, i);
		}

		StringBuilder out = new StringBuilder();
		for (int i = 0; i < M; i++) {
			String op = in.readLine();

			if (op.charAt(0) >= '0' && op.charAt(0) <= '9') {
				out.append(getKey(op) + "\n");
			} else {
				out.append(map.get(op) + "\n");
			}
		}
		
		System.out.print(out);

	}

	public static String getKey(String op) {

		String result = "";

		Iterator<String> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			String cur = itr.next();
			int num = map.get(cur);
			if (num == Integer.parseInt(op)) {
				result = cur;
				break;
			}
		}

		return result;

	}

}

//못풀었음 ..
//
