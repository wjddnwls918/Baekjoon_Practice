import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Ac_1520 {

	static int M, N;
	static int map[][];
	static int dp[][];

	// 위 오른 아래 왼
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { -1, 0, 1, 0 };

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[];
		temp = in.readLine().split(" ");
		M = Integer.parseInt(temp[0]);
		N = Integer.parseInt(temp[1]);

		map = new int[M][N];
		dp = new int[M][N];

		for (int i = 0; i < M; i++) {
			temp = in.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(temp[j]);
			}
		}

		for(int i=0; i<M; i++) {
			Arrays.fill(dp[i], -1);
		}
		
		System.out.println(findRoute(0, 0));
		printDp();
	}

	public static int findRoute(int x, int y) {
		if (x == N - 1 && y == M - 1) {
			return 1;
		}

		if (dp[y][x] != -1)	return dp[y][x];

		dp[y][x] = 0;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx < N && ny >= 0 && ny < M && map[ny][nx] < map[y][x]) {
				dp[y][x] += findRoute(nx, ny);
			}
		}
		return dp[y][x];

	}

	public static void printDp() {
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print(dp[i][j]);
				if(j == N-1)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
	}
}
