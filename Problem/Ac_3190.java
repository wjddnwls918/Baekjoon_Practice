import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Ac_3190 {

	static int N,K,L;
	
	static int map[][];

	// 위 오른 아래 왼
	static int dx[] = { 0, 1, 0, -1 };
	static int dy[] = { -1, 0, 1, 0 };
	
	static char cmd[];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		K = Integer.parseInt(in.readLine());

		map = new int[N + 1][N + 1];
		String input[];
		for (int i = 0; i < K; i++) {
			input = in.readLine().split(" ");
			int y = Integer.parseInt(input[0]);
			int x = Integer.parseInt(input[1]);
			map[y][x] = 1;

		}

		L = Integer.parseInt(in.readLine());

		cmd = new char[10001];

		for (int i = 0; i < L; i++) {
			input = in.readLine().split(" ");
			int time = Integer.parseInt(input[0]);
			char curCmd = input[1].charAt(0);
			cmd[time] = curCmd;
		}
		
		System.out.println(playGame());
	}
	
	public static int playGame() {
		
		int time = 0;
		LinkedList<Snake> snake = new LinkedList<>();
		
		snake.add(new Snake(1,1,1));
		map[1][1] = 2;
		
		while (true) {
			
			time +=1;
			
			Snake head = snake.get(0);
			
			//머리 늘려
			int nx = head.x + dx[head.dir];
			int ny = head.y + dy[head.dir];
			
			if( (nx < 1 || nx>N || ny < 1 || ny >N ) || map[ny][nx] == 2 ) {
				break;
			}
			
			
			//사과가 있다면
			if(map[ny][nx] == 1) {
				
				map[ny][nx] = 2;				
				snake.addFirst(new Snake(nx,ny,head.dir));
				
			} else {
				//없다면
				//처음 채우고
				map[ny][nx] = 2;				
				
				int prex = nx, prey = ny;
				int temx,temy;
				for(int i=0; i<snake.size(); i++) {
					temx = snake.get(i).x;
					temy = snake.get(i).y;	
					
					
					snake.get(i).x = prex;
					snake.get(i).y = prey;
					
					prex = temx;
					prey = temy;
					
					if(i==snake.size()-1) {
						//끝 비우기
						map[temy][temx] = 0;
					}
				}
			}
			
			
			if(cmd[time] == 'L') {
				//왼쪽
				snake.get(0).dir -= 1;
				if(snake.get(0).dir < 0) {
					snake.get(0).dir = 3;
				}
			}
			
			if(cmd[time] == 'D') {
				//오른쪽
				snake.get(0).dir += 1;
				snake.get(0).dir %= 4;
			}
			
			//printMap();
			
		}
		
		return time;
		
	}

	public static void printMap() {
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=N; j++) {
				System.out.print(map[i][j]);
				if(j==N)
					System.out.println();
				else
					System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	static class Snake {

		int x, y, dir;

		public Snake(int x, int y, int dir) {
			this.x = x;
			this.y = y;
			this.dir = dir;
		}

	}

}

//정답
