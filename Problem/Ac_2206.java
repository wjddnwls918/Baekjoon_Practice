import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ac_2206 {

	static int N, M;
	static int map[][];
	static int check[][][];
	static PriorityQueue<Info> que;

	static int min;

	// 위 오른 아래 왼
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { -1, 0, 1, 0 };

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[] = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);

		map = new int[N][M];

		String str;
		for (int i = 0; i < N; i++) {
			str = in.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(str.charAt(j) + "");
			}
		}

		min = 987654321;

		// 경로 찾기
		findMinRoute();

		if (min == 987654321)
			System.out.println(-1);
		else
			System.out.println(min);
	}

	public static void findMinRoute() {

		que = new PriorityQueue();

		Info init = new Info(0, 0, 1, 0);

		que.add(init);
		check = new int[N][M][2];

		check[0][0][0] = 1;

		while (!que.isEmpty()) {
			Info temp = que.poll();

			// System.out.println("temp.x : " + temp.x + " temp.y : " + temp.y);

			if (temp.x == M - 1 && temp.y == N - 1) {
				// System.out.println("result");
				if (min > temp.cnt)
					min = temp.cnt;
				break;
			}

			for (int i = 0; i < 4; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];

				// 범위안
				if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
					// 벽이 없고 처음 간다면
					if (check[ny][nx][temp.breakCnt] != 1 && map[ny][nx] == 0) {
						// 그냥 통과
						check[ny][nx][temp.breakCnt] = 1;
						que.add(new Info(nx, ny, temp.cnt + 1, temp.breakCnt));
					} else if(temp.breakCnt < 1 && map[ny][nx] == 1) {
						// 벽이 있지만 부술 수 있는 경우
						if (check[ny][nx][temp.breakCnt] != 1) {
							// 부수고 통과
							check[ny][nx][temp.breakCnt] = 1;
							que.add(new Info(nx, ny, temp.cnt + 1, 1));
						}
					}

				}

			}
		}

		// System.out.println("end");
	}

	static class Info implements Comparable<Info> {
		int x, y;
		int cnt;
		int breakCnt;

		public Info(int x, int y, int cnt, int breakCnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
			this.breakCnt = breakCnt;
		}

		@Override
		public int compareTo(Info arg0) {
			// if (this.breakCnt > arg0.breakCnt) {
			if (this.cnt > arg0.cnt)
				return 1;
			else
				return -1;			
		}
	}

}


//부수고 온 경우 (breakCnt == 1 )
//안부수고 온 경우 (breakCnt == 0 )
// check에서 3차원으로 두가지 경우를 체크할 수 있다.
