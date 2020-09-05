package notyet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class PS_17136 {

	public static BufferedReader in;
	public static int map[][];

	public static int result = -1;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		makeInput();
		solveProblemByQue();

		System.out.println(result);

	}

	public static void makeInput() throws Exception {

		in = new BufferedReader(new InputStreamReader(System.in));

		map = new int[10][10];

		String input[];
		for (int i = 0; i < 10; i++) {
			input = in.readLine().split(" ");
			for (int j = 0; j < 10; j++) {

				int cur = Integer.parseInt(input[j]);

				if (cur == 1) {
					map[i][j] = -1;
				} else {
					map[i][j] = cur;
				}

			}
		}

	}

	public static void solveProblemByQue() {

		Queue<Info> que = new ArrayDeque<>();
		
		Info init = new Info();
		init.copyMap(init.map, map);
		Arrays.fill(init.checkPaper, 5);

		que.add(init);

		while (!que.isEmpty()) {

			Info cur = que.poll();

			//System.out.println("check");
			
			if (isOk(cur.map)) {
				result = cur.paperCount;
				//System.out.println("check");
				break;
			}

			// 5부터 1까지
			for (int i = 5; i >= 1; i--) {

				for (int j = 0; j < 10; j++) {
					for (int k = 0; k < 10; k++) {
						if (cur.map[j][k] == -1 && checkArea(cur.map, k, j, i) && cur.checkPaper[i - 1] != 0) {

							// 그릴수 있으면
							Info temp = new Info(cur.paperCount + 1, cur.map, cur.checkPaper);

							temp.checkPaper[i - 1] -= 1;

							usePapaer(temp.map, k, j, i);

							que.add(temp);
							
						}
					}
				}

			}
		}

	}

	static class Info {

		int paperCount;
		int map[][];
		int checkPaper[];

		public Info() {

			paperCount = 0;

			map = new int[10][10];
			checkPaper = new int[5];
			Arrays.fill(checkPaper, 5);
		}

		public Info(int paperCount, int map[][], int checkPaper[]) {
			this.paperCount = paperCount;
			this.map = new int[10][10];
			this.checkPaper = new int[5];

			copyMap(this.map, map);
			copyPaper(this.checkPaper, checkPaper);
		}

		public void copyMap(int dst[][], int src[][]) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					dst[i][j] = src[i][j];
				}
			}
		}

		public void copyPaper(int dst[], int src[]) {
			for (int i = 0; i < dst.length; i++) {
				dst[i] = src[i];
			}
		}

	}

	public static boolean checkArea(int map[][], int x, int y, int size) {

		for (int i = y; i < y + size; i++) {

			for (int j = x; j < x + size; j++) {

				if (i >= 10 || j >= 10 || map[i][j] != -1) {
					return false;
				}

			}

		}

		return true;
	}

	public static void usePapaer(int map[][], int x, int y, int size) {

		for (int i = y; i < y + size; i++) {

			for (int j = x; j < x + size; j++) {
				map[i][j] = size;
			}
		}

	}

	public static boolean isOk(int map[][]) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {

				if (map[i][j] == -1) {
					return false;
				}

			}
		}

		return true;
	}

}
