import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_1759 {

	static int L, C;
	static char ch[];
	static char combi[];
	static int check[];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];

		input = in.readLine().split(" ");
		L = Integer.parseInt(input[0]);
		C = Integer.parseInt(input[1]);

		ch = new char[C];
		input = in.readLine().split(" ");
		for (int i = 0; i < C; i++) {
			ch[i] = input[i].charAt(0);
		}

		Arrays.sort(ch);

		combi = new char[L];
		check = new int[C];

		for (int i = 0; i < C; i++) {
			check[i] = 1;
			combi[0] = ch[i];
			find(1, i);
			combi[0] = 0;
			check[i] = 0;
		}

	}

	public static void find(int depth, int pos) {

		/*
		 * if(pos+1 >= C) return;
		 */

		if (depth == L) {

			int mCnt = 0, jCnt = 0;

			for (int i = 0; i < L; i++) {
				if (combi[i] == 'a' || combi[i] == 'e' || combi[i] == 'i' || combi[i] == 'o' || combi[i] == 'u')
					mCnt += 1;
				else
					jCnt += 1;

			}

			if (mCnt >= 1 && jCnt >= 2) {

				for (int i = 0; i < L; i++)
					System.out.print(combi[i]);
				System.out.println();
			}

			return;
		} else {

			for (int i = pos + 1; i < C; i++) {
				if (check[i] != 1) {
					combi[depth] = ch[i];
					check[i] = 1;
					find(depth + 1, i);
					check[i] = 0;
					combi[depth] = 0;
				}
			}

		}
	}

}
