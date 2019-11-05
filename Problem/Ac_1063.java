import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Ac_1063 {

	// 오른 왼 아래 위 오대각 왼대각 오른아래대각 왼아래대각
	static int dx[] = { 1, -1, 0, 0, 1, -1, 1, -1 };
	static int dy[] = { 0, 0, -1, 1, 1, 1, -1, -1 };

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String input[];
		input = in.readLine().split(" ");

		int map[][] = new int[8][8];

		int kingR, kingC, stoneR, stoneC;
		int N;

		kingR = Integer.parseInt(input[0].charAt(1) + "") - 1;
		kingC = input[0].charAt(0) - 'A';

		stoneR = Integer.parseInt(input[1].charAt(1) + "") - 1;
		stoneC = input[1].charAt(0) - 'A';

		N = Integer.parseInt(input[2]);

		map[kingR][kingC] = 1;
		map[stoneR][stoneC] = 2;

		HashMap<String, Integer> cmdMap = new HashMap<>();
		cmdMap.put("R", 0);
		cmdMap.put("L", 1);
		cmdMap.put("B", 2);
		cmdMap.put("T", 3);
		cmdMap.put("RT", 4);
		cmdMap.put("LT", 5);
		cmdMap.put("RB", 6);
		cmdMap.put("LB", 7);

		for (int i = 0; i < N; i++) {
			String command = in.readLine();

			int dir = cmdMap.get(command);

			int nx = kingC + dx[dir];
			int ny = kingR + dy[dir];

			if (nx >= 8 || nx < 0 || ny < 0 || ny >= 8) {
				continue;
			} else {
				if (map[ny][nx] == 2) {

					int nsx = stoneC + dx[dir];
					int nsy = stoneR + dy[dir];

					if (nsx >= 8 || nsx < 0 || nsy < 0 || nsy >= 8) {
						continue;
					} else {
						map[stoneR][stoneC] = 0;
						map[nsy][nsx] = 2;
						stoneR = nsy;
						stoneC = nsx;

						map[kingR][kingC] = 0;
						map[ny][nx] = 1;
						kingR = ny;
						kingC = nx;

					}

				} else {
					map[kingR][kingC] = 0;
					map[ny][nx] = 1;
					kingR = ny;
					kingC = nx;
				}
			}

		}

		System.out.println((char) (kingC + 'A') +""+ (kingR + 1));
		System.out.println((char) (stoneC + 'A') +""+ (stoneR + 1));

	}

}

//정답
