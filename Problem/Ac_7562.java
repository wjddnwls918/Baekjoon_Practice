import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

//나이트의 이동
public class Ac_7562 {

		static int N;
		static int map[][];
		static int check[][];
		static int curX,curY;
		static int dstX,dstY;
		
		//나이트 오위 오아래 왼아래 왼위
		static int dx[] = {1, 2, 2, 1, -1, -2, -2, -1};
		static int dy[] = {-2, -1, 1, 2, 2, 1, -1, -2};
		
		static int result = 0;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for(int x=0; x<T; x++) {
			String temp[];
			
			N = Integer.parseInt(in.readLine());
			temp = in.readLine().split(" ");
			curX = Integer.parseInt(temp[0]);
			curY = Integer.parseInt(temp[1]);
			temp = in.readLine().split(" ");
			dstX = Integer.parseInt(temp[0]);
			dstY = Integer.parseInt(temp[1]);
			
			map = new int[N][N];
			check = new int[N][N];
						
			bfs();
			System.out.println(result);
			
		}
	}
	
	public static void bfs() {
		
		Queue<Info> que = new ArrayDeque<>();
		que.add(new Info(curX,curY,0));
		
		while(!que.isEmpty()) {
			Info temp = que.poll();
			
			if(temp.x == dstX && temp.y == dstY) {
				result = temp.cnt;
				break;
			}
			
			for(int i=0; i<8; i++) {
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];
				if(nx>=0 && nx<N && ny>=0 && ny <N && check[ny][nx]!=1) {
					check[ny][nx] = 1;
					que.add(new Info(nx,ny,temp.cnt+1));
				}
			}
			
		}
		
		
	}
	
	static class Info{
		int x,y;
		int cnt;
		public Info(int x, int y,int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}
	

}

//성공 메모리, 시간 괜찮은듯
