import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class Ac_10798 {

	static HashMap<Integer, String> map;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input;

		map = new HashMap<>();
		for (int i = 0; i < 5; i++) {
			input = in.readLine();
			for (int j = 0; j < input.length(); j++) {
				if (map.containsKey(j)) {
					map.put(j, map.get(j) + input.charAt(j));
				} else {
					map.put(j, input.charAt(j) + "");
				}
			}

		}

		Iterator<Integer> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			System.out.print(map.get(itr.next()));
		}
		System.out.println();

	}

}
