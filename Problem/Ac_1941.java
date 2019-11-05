import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Ac_1941 {

	static char map[][];

	static int combi[];
	static int used[];

	static int newMap[][];
	static int check[][];

	// 위 오른 아래 왼
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { -1, 0, 1, 0 };

	static int curCnt;
	
	static int result;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		map = new char[5][5];
		String input;
		for (int i = 0; i < 5; i++) {
			input = in.readLine();
			for (int j = 0; j < 5; j++) {
				map[i][j] = input.charAt(j);
			}
		}

		// 7명 뽑기
		combi = new int[7];
		used = new int[25];
		selP(0, 0);

		System.out.println(result);

	}

	public static void selP(int depth, int pos) {

		if (depth == 7) {

			/*
			 * for(int i=0; i<7; i++) { System.out.print(combi[i]+ " "); }
			 * System.out.println();
			 */

			newMap = new int[5][5];
			check = new int[5][5];

			int sCnt = 0;

			for (int i = 0; i < 7; i++) {
				if (map[combi[i] / 5][combi[i] % 5] == 'S')
					sCnt += 1;
			}

			if (sCnt >= 4) {

				
				for (int i = 0; i < 7; i++) {
					newMap[combi[i] / 5][combi[i] % 5] = 1;
				}

				check[combi[0] / 5][combi[0] % 5] = 1;
				curCnt = 1;
				
				
				
				checkConnect(combi[0] % 5, combi[0] / 5, 1);
				
				if(curCnt == 7) {			
					result+=1;
					
				}

			}

			return;
		} else {

			for (int i = pos; i < 25; i++) {
				if (used[i] != 1) {
					used[i] = 1;
					combi[depth] = i;
					selP(depth + 1, i+1);
					combi[depth] = 0;
					used[i] = 0;
				}
			}

		}

	}

	public static void printTest() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(newMap[i][j]);
				if (j == 4)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
		System.out.println();
	}

	public static void checkConnect(int x, int y, int cnt) {
		
		if(cnt == 7)
			return;
		

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < 5 && ny >= 0 && ny < 5 && newMap[ny][nx] == 1 && check[ny][nx] != 1) {

				curCnt+=1;
				check[ny][nx] = 1;
				checkConnect(nx, ny, cnt + 1);

			}

		}

	}

}


//메모리 너무큰데 ?