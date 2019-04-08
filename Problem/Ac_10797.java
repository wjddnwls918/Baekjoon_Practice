import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10797 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		String input[] = in.readLine().split(" ");
		int result = 0;
		for (int i = 0; i < input.length; i++) {
			if (N == Integer.parseInt(input[i]))
				result += 1;
		}
		
		System.out.println(result);
	}

}
