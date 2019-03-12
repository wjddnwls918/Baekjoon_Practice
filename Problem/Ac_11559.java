import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ac_11559 {

	static char map[][];
	static int check[][];

	static int curNum;
	static int cnt;

	// 위 오른 아래 왼
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { -1, 0, 1, 0 };
	
	static int result;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		map = new char[12][6];

		String temp;
		for (int i = 0; i < 12; i++) {
			temp = in.readLine();
			for (int j = 0; j < 6; j++) {
				map[i][j] = temp.charAt(j);
			}
		}

		result = 0;
		while (true) {
			
			boolean isDelete = false;
			check = new int[12][6];

			ArrayList<Integer> delNum = new ArrayList<>();
			curNum = 1;
			for (int i = 0; i < 12; i++) {
				for (int j = 0; j < 6; j++) {
					if (map[i][j] != '.' && check[i][j] == 0) {
						cnt = 0;
						findDelete(j, i, map[i][j]);

						if (cnt >= 4) {
							isDelete = true;
							delNum.add(curNum);
						}

						curNum += 1;
					}
				}
			}

			if (!isDelete)
				break;

			for (int i = 0; i < delNum.size(); i++) {				
				deletePuyo(delNum.get(i));
			}
			
			
			
			toBottom();
			
			//System.out.println("check");
			//printMap();
			
			result += 1;
		}
		
		System.out.println(result);

	}
	
	public static void printMap() {
		for(int i=0; i<12; i++) {
			for(int j=0; j<6; j++) {
				System.out.print(map[i][j]);
					if(j==5)
						System.out.println();
			}
		}
	}

	public static void findDelete(int x, int y, char cur) {

		cnt += 1;
		check[y][x] = curNum;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < 6 && ny >= 0 && ny < 12 && check[ny][nx] == 0 && map[ny][nx] == cur) {
				findDelete(nx, ny, cur);
			}
		}
	}

	public static void deletePuyo(int num) {
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 6; j++) {
				if (check[i][j] == num) {
					map[i][j] = '.';
				}
			}
		}
	}

	public static void toBottom() {
		for (int i = 0; i < 6; i++) {

			int curPos = -1;
			for (int j = 11; j >= 0; j--) {
				if (map[j][i] == '.') {
					curPos = j;
					break;
				}
				
			}

			if (curPos != -1) {
				for (int j = curPos - 1; j >= 0; j--) {
					if(map[j][i] != '.') {
						char temp = map[j][i];
						map[j][i] = '.';
						map[curPos][i] = temp;
						
						//position 찾기
						for (int k= curPos; k >= 0; k--) {
							if (map[k][i] == '.') {
								curPos = k;
								break;
							}							
						}
						//curPos -= 1;
					}
				}
			}
		}
	}

}

//정답 puyo puyo