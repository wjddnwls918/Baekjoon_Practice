import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_17135 {

	static int N, M, D;
	static int map[][];
	static int arcPos[];
	static int totalCnt;

	static int catchCnt;
	static int curCnt;
	static int result;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		D = Integer.parseInt(input[2]);

		map = new int[N][M];

		totalCnt = 0;
		for (int i = 0; i < N; i++) {
			input = in.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(input[j]);

				if (map[i][j] == 1)
					totalCnt += 1;
			}
		}

		arcPos = new int[3];
		result = 0;
		// 궁수 자리 세개뽑기
		for (int i = 0; i < 1 << M; i++) {

			if (Integer.bitCount(i) == 3) {

				int k = 0;
				// System.out.println(i);
				// 선정하고
				for (int j = 0; j < M; j++) {

					if ((i & 1 << j) == 1 << j) {
						arcPos[k] = j;
						k++;
					}

				}

				// 계산하고
				int newMap[][] = new int[N][M];
				copyMap(map, newMap);

				curCnt = totalCnt;
				catchCnt = 0;
				while (curCnt != 0) {

					// printTest(newMap);

					defense(newMap);

					// printTest(newMap);

					attack(newMap);
				}

				if (result < catchCnt) {
					result = catchCnt;
				}
			}

		}

		System.out.println(result);

	}

	public static void printTest(int map[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(map[i][j]);
				if (j == M - 1)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
	}

	public static void defense(int map[][]) {

		int minVal[] = new int[3];

		int minArcX[] = new int[3];
		int minArcY[] = new int[3];

		for (int i = 0; i < 3; i++) {
			minVal[i] = 987654321;
			minArcX[i] = -1;
			minArcY[i] = -1;
		}

		// 궁수 1,2,3 순서대로
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {

					if (map[j][k] == 1) {

						int arcX = arcPos[i];
						int arcY = N;

						int curDis = Math.abs(arcX - k) + Math.abs(arcY - j);

						if (curDis <= D && minVal[i] >= curDis) {

							// 같으면 가장 왼쪽에 있는거
							if (minVal[i] == curDis) {

								if (k < minArcX[i]) {

									minVal[i] = curDis;
									minArcX[i] = k;
									minArcY[i] = j;
								}
							} else {
								//다르면 
								minVal[i] = curDis;
								minArcX[i] = k;
								minArcY[i] = j;
							}
						}
					}
				}

			}

		}

		// 지우기
		for (int i = 0; i < 3; i++) {
			if ((minArcY[i] != -1 && minArcX[i] != -1) && map[minArcY[i]][minArcX[i]] == 1) {
				// System.out.println("check");
				map[minArcY[i]][minArcX[i]] = 0;
				catchCnt += 1;
				curCnt -= 1;
			}
		}

	}

	public static void attack(int map[][]) {

		// 적 공격

		for (int j = 0; j < M; j++) {
			for (int i = N - 1; i >= 0; i--) {
				if (map[i][j] == 1) {

					// 끝인 경우
					if (i + 1 == N) {
						map[i][j] = 0;
						curCnt -= 1;
					} else {
						// 아닌 경우
						map[i][j] = 0;
						map[i + 1][j] = 1;
					}
				}
			}
		}

	}

	public static void copyMap(int src[][], int dst[][]) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				dst[i][j] = src[i][j];
			}
		}
	}

}

//정답
