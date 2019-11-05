import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5618 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		String input[];
		input = in.readLine().split(" ");
		int num[] = new int[n];
		int min = 987654321;
		for (int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(input[i]);
			if (min > num[i]) {
				min = num[i];
			}
		}

		for (int i = 1; i <= min; i++) {
			boolean isOk = true;

			for (int j = 0; j < n; j++) {
				if (num[j] % i != 0) {
					isOk = false;
					break;
				}
			}

			if (isOk)
				System.out.println(i);
		}

	}

}
