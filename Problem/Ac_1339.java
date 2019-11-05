import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ac_1339 {

	static int checkAlpha[];
	static String str[];

	static char exNum[];
	static int combi[];
	static int useNum[];

	static int cnt;
	static int result;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		checkAlpha = new int[26];

		str = new String[N];
		for (int i = 0; i < N; i++) {
			str[i] = in.readLine();
			for (int j = 0; j < str[i].length(); j++) {
				checkAlpha[str[i].charAt(j) - 'A'] = 1;
			}
		}

		for (int i = 0; i < 26; i++) {
			if (checkAlpha[i] == 1) {
				cnt += 1;
			}
		}

		// ÀÖ´Â ¾ËÆÄºª
		exNum = new char[cnt];
		for (int i = 0; i < 26; i++) {
			if (checkAlpha[i] == 1) {
				exNum[i] = (char) (i + 'A');
			}
		}

		combi = new int[26];
		useNum = new int[10];

		result = 0;

		
		findMax(0);
			
		System.out.println(result);

	}

	public static void findMax(int depth) {

		if (depth == cnt) {

			int curSum = 0;

			for (int i = 0; i < str.length; i++) {
				String temp = "";

				for (int j = 0; j < str[i].length(); j++) {
					temp += combi[str[i].charAt(j)-'A'];
				}
				
				curSum += Integer.parseInt(temp);
			}

			if (result < curSum)
				result = curSum;

			return;
		} else {

			for (int j = 0; j <= 9; j++) {

				if (useNum[j] != 1) {

					combi[exNum[depth]-'A'] = j;
					useNum[j] = 1;
					findMax(depth + 1);
					combi[exNum[depth]-'A'] = 0;
					useNum[j] = 0;

				}
			}

		}

	}

}

/// ......