import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Ac_5427 {

	static int w, h;
	static char map[][];

	// 위 오른 아래 왼
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { -1, 0, 1, 0 };

	static int result;

	static int curX, curY;
	static Queue<Info> que;
	static Queue<Info> fire;
	
	static int check[][];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		String input[];
		for (int x = 1; x <= T; x++) {
			input = in.readLine().split(" ");
			w = Integer.parseInt(input[0]);
			h = Integer.parseInt(input[1]);

			map = new char[h][w];
			check = new int[h][w];
			String str;
			fire = new ArrayDeque<>();
			for (int i = 0; i < h; i++) {
				str = in.readLine();
				for (int j = 0; j < w; j++) {
					map[i][j] = str.charAt(j);
					if (map[i][j] == '@') {
						curX = j;
						curY = i;
						map[i][j] = '.';
					}

					if (map[i][j] == '*') {
						fire.add(new Info(j, i));
					}

				}
			}

			result = 0;
			findRoute();

			if (result != 0)
				System.out.println(result);
			else
				System.out.println("IMPOSSIBLE");
		}
	}

	public static void findRoute() {
		que = new ArrayDeque<>();

		// System.out.println(curY +" "+ curX);

		que.add(new Info(curX, curY, 0));
		check[curY][curX] = 1;

		int fire = -1;
		while (!que.isEmpty()) {
			Info cur = que.poll();

			// System.out.println("y : "+ cur.y+" x : "+cur.x+" moveCnt: "+cur.moveCnt);

			if (fire < cur.moveCnt) {
				fireMove();
				fire += 1;
			}

			//printTest();
			
			for (int i = 0; i < 4; i++) {
				int nx = cur.x + dx[i];
				int ny = cur.y + dy[i];
				if (nx >= 0 && nx < w && ny >= 0 && ny < h) {
					if (map[ny][nx] != '*' && map[ny][nx] != '#' && check[ny][nx] != 1) {
						check[ny][nx] = 1;
						que.add(new Info(nx, ny, cur.moveCnt + 1));
					}
				} else {
					// 밖을 벗어났으면
					result = cur.moveCnt + 1;
					break;
				}
			}

			if (result != 0)
				break;
		}

	}

	public static void printTest() {
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				System.out.print(map[i][j]);
				if(j == w-1)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
		System.out.println();
	}

	public static boolean isFire(int x, int y) {
		boolean can = true;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx >= 0 && nx < w && ny >= 0 && ny < h && map[ny][nx] == '*') {
				can = false;
				break;
			}
		}

		return can;
	}

	public static void fireMove() {

		int size = fire.size();
		//System.out.println("size: "+ size);

		for (int i = 0; i < size; i++) {
			Info cur = fire.poll();

			for (int j = 0; j < 4; j++) {
				int nx = cur.x + dx[j];
				int ny = cur.y + dy[j];
				if (nx >= 0 && nx < w && ny >= 0 && ny < h && map[ny][nx] != '#' && map[ny][nx] != '*') {
					map[ny][nx] = '*';
					fire.add(new Info(nx, ny));
				}
			}

		}

	}

	static class Info {
		int x, y;
		int moveCnt;

		public Info(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public Info(int x, int y, int moveCnt) {
			this.x = x;
			this.y = y;
			this.moveCnt = moveCnt;
		}
	}
}

//오 .. 시간 및 메모리 매우 우수
