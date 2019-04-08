import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_9663 {

	static int N;

	static int quePosX[];
	static int map[][];
	static int result;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());

		map = new int[N][N];

		quePosX = new int[N];

		result = 0;
		nQueen(0);

		System.out.println(result);
	}

	public static void nQueen(int pos) {

		if (pos == N) {
			result += 1;
			return;
		}

		for (int i = 0; i < N; i++) {

			if (isOk(i, pos)) {

				quePosX[pos] = i;
				map[pos][i] = 1;
				
				//System.out.println("quepos : "+quePosX[pos] +" curpos : "+pos);
				nQueen(pos + 1);
				map[pos][i] = 0;
				quePosX[pos] = 0;

				
			}

		}

	}

	public static void printTest() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j]);
				if (j == N - 1)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
		System.out.println();
	}

	public static boolean isOk(int x, int y) {

		// Ã¹ÁÙ
		if (y == 0)
			return true;
		else {

			for (int i = 0; i < y; i++) {

				if (quePosX[i] == x || (Math.abs(x - quePosX[i]) == Math.abs(y - i))) {
					return false;
				}

			}

		}

		return true;
	}

}


//Å¯ ...