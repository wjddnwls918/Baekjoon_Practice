import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2609 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int a, b, g;
		String temp[];
		temp = in.readLine().split(" ");
		a = Integer.parseInt(temp[0]);
		b = Integer.parseInt(temp[1]);

		g = getg(a, b);

		System.out.println(g);
		System.out.println(a * b / g);

	}

	public static int getg(int a, int b) {
		if (a % b == 0)
			return b;
		else
			return getg(b, a % b);

	}

}
