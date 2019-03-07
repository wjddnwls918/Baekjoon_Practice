import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10818 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int max = -1000001;
		int min = 987654321;
		String temp[];
		temp = in.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			int cur = Integer.parseInt(temp[i]);
			if (cur > max)
				max = cur;
			if (cur < min)
				min = cur;
		}

		System.out.println(min + " " + max);
	}

}
