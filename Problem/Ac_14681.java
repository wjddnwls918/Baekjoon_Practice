import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_14681 {

	static int x, y;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		x = Integer.parseInt(in.readLine());
		y = Integer.parseInt(in.readLine());

		if (x > 0 && y > 0)
			System.out.println(1);
		else if (x < 0 && y > 0)
			System.out.println(2);
		else if (y < 0 && x < 0)
			System.out.println(3);
		else
			System.out.println(4);

	}

}
