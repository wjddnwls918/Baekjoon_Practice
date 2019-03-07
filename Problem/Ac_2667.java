import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_2667 {

	public static int N;
	public static int cnt;
	public static int[] c;

	// 위 오른 아래 왼
	public static int dx[] = { 0, 1, 0, -1 };
	public static int dy[] = { -1, 0, 1, 0 };

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		int temp = 0;
		cnt = 1;

		int map[][] = new int[N + 1][N + 1];
		c = new int[N * N + 1];

		String temStr;
		for (int i = 1; i <= N; i++) {
			temStr = in.readLine();
			for (int j = 1; j <= N; j++) {
				if (temStr.charAt(j - 1) == '1')
					map[i][j] = -1;
			}
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (map[i][j] == -1 && map[i][j] != cnt) {
					dfs(i, j, map);
					cnt++;
				}
			}
		}

		System.out.println(cnt - 1);
		Arrays.sort(c);
		for (int i = 1; i < c.length; i++) {
			if (c[i] != 0)
				System.out.println(c[i]);
		}
	}

	public static void dfs(int y, int x, int map[][]) {
		map[y][x] = cnt;
		c[cnt]++;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 1 && nx <= N && ny >= 1 && ny <= N && map[ny][nx] != cnt && map[ny][nx] == -1) {
				dfs(ny, nx, map);
			}
		}

	}

}
