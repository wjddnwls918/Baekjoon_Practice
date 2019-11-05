import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Ac_2174 {

	// 위 오른 아래 왼
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { 1, 0, -1, 0 };

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];

		int A, B, N, M;

		input = in.readLine().split(" ");
		A = Integer.parseInt(input[0]);
		B = Integer.parseInt(input[1]);

		int map[][] = new int[B][A];

		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);

		HashMap<String, Integer> dirMap = new HashMap<>();
		dirMap.put("N", 0);
		dirMap.put("E", 1);
		dirMap.put("S", 2);
		dirMap.put("W", 3);

		Robot ro[] = new Robot[N];
		for (int i = 0; i < N; i++) {
			input = in.readLine().split(" ");
			int x, y;
			String dir;
			x = Integer.parseInt(input[0])-1;
			y = Integer.parseInt(input[1])-1;
			dir = input[2];

			map[y][x] = i + 1;

			ro[i] = new Robot(x, y, dirMap.get(dir));
		}
		

		boolean isEnd = false;

		for (int i = 0; i < M; i++) {
			
			if (isEnd)
				break;
			
			input = in.readLine().split(" ");			

			int robotNum = Integer.parseInt(input[0]);
			String commandType = input[1];
			int count = Integer.parseInt(input[2]);

			for (int j = 0; j < count; j++) {
				if (commandType.equals("L")) {
					
					ro[robotNum-1].dir-=1;
					if(ro[robotNum-1].dir < 0 ) {
						ro[robotNum-1].dir = 3;
					}						
					
				} else if (commandType.equals("R")) {						

					ro[robotNum-1].dir+=1;
					ro[robotNum-1].dir %= 4;						
					
					
				} else {
					int nx = ro[robotNum-1].x + dx[ro[robotNum-1].dir];
					int ny = ro[robotNum-1].y + dy[ro[robotNum-1].dir];
					
					if(nx <0 || nx >= A || ny <0 || ny >=B) {
						System.out.println("Robot "+ robotNum +" crashes into the wall");
						isEnd = true;
						break;
					}					
					
					if(map[ny][nx] != 0) {
						System.out.println("Robot "+robotNum+" crashes into robot "+map[ny][nx]);
						isEnd = true;
						break;
					}
					
					map[ro[robotNum-1].y][ro[robotNum-1].x] = 0;
					
					ro[robotNum-1].x = nx;
					ro[robotNum-1].y = ny;
					
					map[ny][nx] = robotNum;
					
					
				}
			}

		}

		if (!isEnd) {
			System.out.println("OK");
		}

	}

	static class Robot {
		int x, y;
		int dir;

		public Robot(int x, int y, int dir) {
			this.x = x;
			this.y = y;
			this.dir = dir;
		}
	}

}


//정답
