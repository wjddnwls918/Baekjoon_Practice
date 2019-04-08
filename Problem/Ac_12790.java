import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_12790 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		String input[];
		for (int x = 1; x <= T; x++) {
			input = in.readLine().split(" ");
			int hp = Integer.parseInt(input[0]);
			int mp = Integer.parseInt(input[1]);
			int attack = Integer.parseInt(input[2]);
			int def = Integer.parseInt(input[3]);

			hp += Integer.parseInt(input[4]);
			mp += Integer.parseInt(input[5]);
			attack += Integer.parseInt(input[6]);
			def += Integer.parseInt(input[7]);

			if (hp < 1)
				hp = 1;
			if (mp < 1)
				mp = 1;
			if (attack < 0)
				attack = 0;
			
			
			System.out.println(1*hp + 5 * mp + 2 * attack + 2 * def);

		}
	}

}
