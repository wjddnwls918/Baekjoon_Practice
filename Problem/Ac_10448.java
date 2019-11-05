import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10448 {

	static int triNum[];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		triNum = new int[47];
		int T = Integer.parseInt(in.readLine());

		triNum[1] = 1;
		int term = 2;
		for (int i = 2; i < triNum.length; i++) {
			triNum[i] = triNum[i - 1] + term;
			term += 1;
		}

		for (int x = 1; x <= T; x++) {
			int N = Integer.parseInt(in.readLine());

			boolean isOk = false;
			for (int i = 1; i < triNum.length; i++) {
				int curSum = 0;
				for (int j = 1; j < triNum.length; j++) {
					for (int k = 1; k < triNum.length; k++) {
						curSum = triNum[i] + triNum[j] + triNum[k];
						if (curSum == N) {
							isOk = true;
							break;
						}
					}
					if (isOk)
						break;
				}
				if (isOk)
					break;
			}
			
			
			if(isOk)
				System.out.println(1);
			else
				System.out.println(0);

		}
	}

}
