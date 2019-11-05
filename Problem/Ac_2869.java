import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2869 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[] = in.readLine().split(" ");
		double A, B, V;
		A = Integer.parseInt(input[0]);
		B = Integer.parseInt(input[1]);
		V = Integer.parseInt(input[2]);

		double result = (V - B) / (A - B);

		if (V == A)
			System.out.println(1);
		else
			System.out.println((int)Math.ceil(result));

	}

}
