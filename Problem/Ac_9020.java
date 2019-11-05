import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ac_9020 {

	static int num[];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		int T = Integer.parseInt(in.readLine());

		num = new int[10001];

		isPrime();

		for (int tc = 1; tc <= T; tc++) {
			int n = Integer.parseInt(in.readLine());

			int a = 0, b = 0;
			int min = 987654321;

			for (int i = 2; i <= 10000; i++) {

				if (n - i >= 0 && num[i] != 1 && num[n - i] != 1) {

					int left = i;
					int right = n - left;
					
					int dis = Math.abs(left-right);
					
					if(min > dis) {
						
						min = dis;
						a = left;
						b = right;						
					}
					

				}

			}

			out.append(a+" "+b+"\n");

		}
		
		System.out.println(out);

	}

	public static void isPrime() {

		num[0] = 1;
		num[1] = 1;

		for (int i = 2; i <= 10000; i++) {

			if (num[i] != 1) {
				for (int j = i + i; j <= 10000; j += i) {
					num[j] = 1;
				}
			}

		}

	}

}
