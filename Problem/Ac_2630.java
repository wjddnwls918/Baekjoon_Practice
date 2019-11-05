import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2630 {

	static int map[][];
	static int cnt[];

	static int dx[] = { 0, 1, 0, 1 };
	static int dy[] = { 0, 0, 1, 1 };

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());

		map = new int[N][N];
		cnt = new int[2];

		String input[];
		for (int i = 0; i < N; i++) {
			input = in.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(input[j]);
			}

		}

		cutColorPaper(0, 0, N);

		System.out.println(cnt[0]);
		System.out.println(cnt[1]);

	}

	public static void cutColorPaper(int x, int y, int size) {

		if (checkMap(x, y, size, map[y][x])) {
			cnt[map[y][x]]+=1;
			return;
		} else {

			for(int i=0; i<4; i++) {
				
				int nx = x + (dx[i] * (size/2));
				int ny = y + (dy[i] * (size/2));
				
				cutColorPaper(nx,ny,size/2);
				
			}
			
			
		}

	}

	public static boolean checkMap(int x, int y, int size, int color) {

		for (int i = y; i < y + size; i++) {
			for (int j = x; j < x + size; j++) {
				if (map[i][j] != color) {
					return false;
				}
			}
		}

		return true;

	}

}

//correct answer
