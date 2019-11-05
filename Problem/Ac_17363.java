import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Ac_17363 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		HashMap<Character, Character> map = new HashMap<>();

		map.put('.', '.');
		map.put('O', 'O');
		map.put('-', '|');
		map.put('|', '-');
		map.put('/', '\\');
		map.put('\\', '/');
		map.put('^', '<');
		map.put('<', 'v');
		map.put('v', '>');
		map.put('>', '^');

		int N, M;
		String input[];
		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		char picture[][] = new char[N][M];

		String in2;
		for (int i = 0; i < N; i++) {
			in2 = in.readLine();
			for (int j = 0; j < M; j++) {
				picture[i][j] = in2.charAt(j);
			}
		}
		
		for(int i=M-1; i>=0; i--) {
			for(int j=0; j<N; j++) {
				if(map.containsKey(picture[j][i])) {
					out.append(map.get(picture[j][i]));
				} else {
					out.append(picture[j][i]);
				}
			}
			out.append("\n");
		}
		
		System.out.println(out);
		
	}

}
