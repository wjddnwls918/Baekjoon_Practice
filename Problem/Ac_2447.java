import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2447 {

	static char map[][];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		int N = Integer.parseInt(in.readLine());

		map = new char[2201][2201];

		drawMap(0, 0, N);

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == '*')
					out.append(map[i][j]);
				else
					out.append(' ');
			}
			out.append("\n");
		}

		System.out.println(out);
	}

	public static void drawMap(int x, int y, int num) {

		if (num == 1) {
			map[y][x] = '*';
			return;
		}

		int div = num / 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!(i == 1 && j == 1)) {
					drawMap(x + (j * div), y + (i * div), div);
				}
			}
		}

	}

}

//분할정복 이해 필요 
