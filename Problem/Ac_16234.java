import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_16234 {

	static int N, L, R;
	static Info map[][];

	static int result;

	// 위 오른 아래 왼
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { -1, 0, 1, 0 };

	static int check[][];

	static int pnt;
	static int sum[];
	static int popCnt[];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		L = Integer.parseInt(input[1]);
		R = Integer.parseInt(input[2]);

		map = new Info[N][N];

		for (int i = 0; i < N; i++) {
			input = in.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				int curPop = Integer.parseInt(input[j]);
				map[i][j] = new Info(curPop, 0);
			}
		}

		result = 0;
		find();
		System.out.println(result);

	}

	public static void find() {

		//for (int l = 0; l < 1; l++) {
			 while(true) {

			boolean isEnd = true;

			// 문열기
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					// 4방향
					for (int k = 0; k < 4; k++) {
						int nx = j + dx[k];
						int ny = i + dy[k];

						if (nx >= 0 && nx < N && ny >= 0 && ny < N) {

							int dis = Math.abs(map[ny][nx].curPop - map[i][j].curPop);

							if (dis >= L && dis <= R) {
								// 연다
								map[i][j].door |= 1 << k;
								isEnd = false;
							}
						}

					}

				}
			}

			if (isEnd)
				break;

			//횟수 세기
			result += 1;
			
			// 계산하기
			check = new int[N][N];
			sum = new int[2501];
			popCnt = new int[2501];
			pnt = 1;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					if (map[i][j].door != 0 && check[i][j] != pnt) {
						check[i][j] = pnt;
						sum[pnt] += map[i][j].curPop;
						popCnt[pnt] += 1;
						dfs(j, i);
						pnt += 1;
					}

				}
			}

			// 바꾸기
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {

					if (popCnt[check[i][j]] != 0) {
						map[i][j].curPop = sum[check[i][j]] / popCnt[check[i][j]];
					}
				}
			}

		
			// 문 닫기
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j].door = 0;
				}
			}

			
		}

	}

	public static void printTest() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j].curPop);
				if (j == N - 1)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
	}

	public static void dfs(int x, int y) {

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx < N && ny >= 0 && ny < N && check[ny][nx] != pnt && ((map[y][x].door & 1 << i) == 1 << i)) {
				check[ny][nx] = pnt;
				sum[pnt] += map[ny][nx].curPop;
				popCnt[pnt] += 1;
				dfs(nx, ny);
			}

		}

	}

	static class Info {
		int curPop;
		int door;

		public Info(int curPop, int door) {
			this.curPop = curPop;
			this.door = door;
		}
	}

}

//인구이동 정답 메모리, 실행시간 양호
//40분정도 걸림
