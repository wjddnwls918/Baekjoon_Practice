import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Ac_17070 {

	static int N;

	static int map[][];

	// 오른 오른아래 아래
	static int dx[] = { 1, 1, 0 };
	static int dy[] = { 0, 1, 1 };

	static Queue<Info> que;

	static int result;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		String input[];

		map = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			input = in.readLine().split(" ");
			for (int j = 1; j <= N; j++) {
				map[i][j] = Integer.parseInt(input[j - 1]);
			}
		}

		result = 0;
		findRoute();

		System.out.println(result);

	}

	public static void findRoute() {
		que = new ArrayDeque<>();
		que.add(new Info(1, 1, 2, 1, 0));


		while (!que.isEmpty()) {

			Info cur = que.poll();
			
			if (cur.fX == N && cur.fY == N) {
				result += 1;
			}

			int nbx, nby, nfx, nfy;

			// 가로면
			if (cur.dir == 0) {

				// 0,1

				for (int i = 0; i < 2; i++) {
					
					
					if (i == 1 && cur.fX + 1 <= N && cur.fY + 1 <= N
							&& (map[cur.fY][cur.fX + 1] != 0 || map[cur.fY + 1][cur.fX] != 0))
						continue;
					
					nbx = cur.fX;
					nby = cur.fY;
					nfx = cur.fX + dx[i];
					nfy = cur.fY + dy[i];
					if (nbx >= 1 && nbx <= N && nby >= 1 && nby <= N && nfx >= 1 && nfx <= N && nfy >= 1 && nfy <= N) {
						if (map[nby][nbx] != 1 && map[nfy][nfx] != 1) {
							que.add(new Info(nbx, nby, nfx, nfy, i));
						}
					}
				}

			} else if (cur.dir == 1) {
				// 대각선
				// 0,1,2

				for (int i = 0; i < 3; i++) {
					
					if (i == 1 && cur.fX + 1 <= N && cur.fY + 1 <= N
							&& (map[cur.fY][cur.fX + 1] != 0 || map[cur.fY + 1][cur.fX] != 0))
						continue;
					
					
					nbx = cur.fX;
					nby = cur.fY;
					nfx = cur.fX + dx[i];
					nfy = cur.fY + dy[i];
					
					
					if (nbx >= 1 && nbx <= N && nby >= 1 && nby <= N && nfx >= 1 && nfx <= N && nfy >= 1 && nfy <= N) {
						if (map[nby][nbx] != 1 && map[nfy][nfx] != 1) {							
							que.add(new Info(nbx, nby, nfx, nfy, i));
						}
					}
				}

			} else {
				// 세로
				// 1,2
				for (int i = 1; i < 3; i++) {
					
					if (i == 1 && cur.fX + 1 <= N && cur.fY + 1 <= N
							&& (map[cur.fY][cur.fX + 1] != 0 || map[cur.fY + 1][cur.fX] != 0))
						continue;
					
					nbx = cur.fX;
					nby = cur.fY;
					nfx = cur.fX + dx[i];
					nfy = cur.fY + dy[i];
					if (nbx >= 1 && nbx <= N && nby >= 1 && nby <= N && nfx >= 1 && nfx <= N && nfy >= 1 && nfy <= N) {
						if (map[nby][nbx] != 1 && map[nfy][nfx] != 1) {
							
							que.add(new Info(nbx, nby, nfx, nfy, i));
						}
					}
				}
			}

		}

	}

	static class Info {
		int bX, bY, fX, fY;
		int dir;

		public Info(int bX, int bY, int fX, int fY, int dir) {
			this.bX = bX;
			this.bY = bY;
			this.fX = fX;
			this.fY = fY;
			this.dir = dir;
		}
	}

}

//너무오래걸림 ..
//아 ..
