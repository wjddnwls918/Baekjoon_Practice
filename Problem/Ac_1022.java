import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1022 {

	static int map[][];

	// 위 왼 아래 오른
	static int dx[] = { 0, -1, 0, 1 };
	static int dy[] = { -1, 0, 1, 0 };

	static int r1, c1, r2, c2;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		String input[];

		input = in.readLine().split(" ");
		r1 = Integer.parseInt(input[0]);
		c1 = Integer.parseInt(input[1]);
		r2 = Integer.parseInt(input[2]);
		c2 = Integer.parseInt(input[3]);

		map = new int[10001][10001];
		map[5000][5000] = 1;
		int pnt = 2;

		int dir = 0;
		int x = 5001;
		int y = 5000;
		while (true) {

			// 넣고
			if (x >= 0 && x <= 10000 && y >= 0 && y <= 10000 && map[y][x] == 0) {
				map[y][x] = pnt;
				pnt += 1;

				int nextDir = dir + 1;
				if (nextDir >= 4)
					nextDir = 0;

				// 회전 체크
				int nx = x + dx[nextDir];
				int ny = y + dy[nextDir];

				if (map[ny][nx] == 0) {
					dir += 1;
					if (dir >= 4)
						dir = 0;
				}

				x = x + dx[dir];
				y = y + dy[dir];

			} else
				break;

		}

		int max = 0;

		for (int i = r1 + 5000; i <= r2 + 5000; i++) {
			for (int j = c1 + 5000; j <= c2 + 5000; j++) {
				if (max < map[i][j])
					max = map[i][j];
			}
		}

		int len = Integer.toString(max).length();
		for (int i = r1 + 5000; i <= r2 + 5000; i++) {
			for (int j = c1 + 5000; j <= c2 + 5000; j++) {
				// System.out.print(map[i][j]);

				int curLen = Integer.toString(map[i][j]).length();
				if (curLen == len) {					
					out.append(map[i][j]);
				} else {
					String trans ="";
					for(int k=0; k<len-curLen; k++)
						trans += " ";
					trans += map[i][j];
					out.append(trans);
				}
				if (j == c2 + 5000)
					// System.out.println();
					out.append("\n");
				else
					// System.out.print(" ");
					out.append(" ");
			}
		}

		System.out.println(out);

	}

}
