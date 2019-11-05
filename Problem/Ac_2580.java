import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ac_2580 {

	static int sdoku[][];

	static boolean isEnd;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		sdoku = new int[9][9];

		for (int i = 0; i < 9; i++) {
			input = in.readLine().split(" ");
			for (int j = 0; j < 9; j++) {
				sdoku[i][j] = Integer.parseInt(input[j]);
			}
		}

		isEnd = false;
		fillSdoku();

	}

	public static void fillSdoku() {

		if (isEnd)
			return;

		int x = -1, y = -1;

		find: for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (sdoku[i][j] == 0) {
					x = j;
					y = i;
					break find;
				}
			}
		}

		if (x == -1) {
			// System.out.println("check");

			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(sdoku[i][j] + " ");
				}
				System.out.println();
			}

			isEnd = true;
			return;
			
		} else {

			for (int j = 1; j <= 9; j++) {

				if (isPossible(x, y, j)) {
					sdoku[y][x] = j;
					fillSdoku();
					sdoku[y][x] = 0;
				}
			}

		}

	}

	public static boolean isPossible(int x, int y, int num) {

		// 가로, 세로
		for (int i = 0; i < 9; i++) {
			if (sdoku[y][i] == num || sdoku[i][x] == num) {
				return false;
			}
		}

		// 정사각형
		int initY = (y / 3) * 3;
		int initX = (x / 3) * 3;

		for (int i = initY; i < initY + 3; i++) {
			for (int j = initX; j < initX + 3; j++) {
				if (sdoku[i][j] == num) {
					return false;
				}
			}
		}

		return true;
	}

}
