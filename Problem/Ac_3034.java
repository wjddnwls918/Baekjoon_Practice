import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_3034 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N, W, H;
		String input[];
		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		W = Integer.parseInt(input[1]);
		H = Integer.parseInt(input[2]);

		double cross = Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2));

		for (int i = 0; i < N; i++) {
			int len = Integer.parseInt(in.readLine());
			if(len <=cross) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}

	}

}
