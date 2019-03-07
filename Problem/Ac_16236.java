import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ac_16236 {

		static int N;
		static int map[][];
		static int check[][];
		
		static BabyShark shark;
		static Info info;
		
		static Queue<Info> que;
		
		static boolean isCant;
		
		//위 오른 아래 왼
		static int dx[] = {0, 1, 0, -1};
		static int dy[] = {-1, 0, 1, 0};
		
		static int result;
		
		static int total;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		
		map = new int[N][N];
		String tem[];
		total = 0;
		for(int i=0; i<N; i++) {
			tem = in.readLine().split(" ");
			for(int j=0; j<N; j++) {
				map[i][j] = Integer.parseInt(tem[j]);
				if(map[i][j] == 9) {
					
					map[i][j] = 0;
					
					shark = new BabyShark(j, i, 2, 0);
					
				}
				
				if(map[i][j] >=1 && map[i][j] <=6)
					total ++;
				
			}
		}
		
		
		
		isCant = false;
		result = 0;
		
		//while(!isCant) {
		for(int i=0; i<total; i++) {
			//System.out.println("check");
			info = new Info(shark.x,shark.y,0);
			que = new ArrayDeque<>();
			que.add(info);
			
			check = new int[N][N];
			check[info.y][info.x] = 1;
			
			bfs();
			
			if(isCant)
				break;
			
		}
		
		System.out.println(result);
		
		
	}
	
	public static void bfs() {
		
		
		
		boolean isFind = false;
		int curDis = 0;
		
		PriorityQueue<Info> arr = new PriorityQueue();
		
		while(!que.isEmpty()) {
			
			Info cur = que.poll();
			
			
			
			if(isFind) {
				
				if(cur.cnt == curDis && map[cur.y][cur.x] != 0 && map[cur.y][cur.x] <shark.size ) {
					//System.out.println("1 curx : " + cur.x +" cury : "+ cur.y);
					arr.add(cur);
					continue;
				}else if(cur.cnt != curDis){
					break;
				}
				
			}
			
			if(map[cur.y][cur.x] != 0 && map[cur.y][cur.x] < shark.size) {
				
				isFind = true;
				curDis = cur.cnt;
				
				//System.out.println("2 curx : " + cur.x +" cury : "+ cur.y);
				arr.add(cur);
				continue;
			}
			
			
			for(int i=0; i<4; i++) {
				
				int nx = cur.x + dx[i];
				int ny = cur.y + dy[i];
				
				if(nx >= 0 && nx < N && ny >=0 && ny <N && check[ny][nx] != 1 && map[ny][nx] <= shark.size ) {
					
					check[ny][nx] = 1;
					que.add(new Info(nx,ny,cur.cnt+1));
					
				}			
				
			}
			
			
		}
		
		if(arr.isEmpty())
			isCant = true;
		else {
			
			//System.out.println(arr.size());
			
			Info temp = arr.poll();
			
			
			
			//System.out.println(" x : " + temp.x +" y : "+ temp.y);
			
			shark.x = temp.x;
			shark.y = temp.y;
			
			map[temp.y][temp.x] = 0; 
			
			shark.be += 1;
			
			if(shark.size == shark.be) {
				shark.size+=1;
				shark.be = 0;
			}
			
			result += curDis;
			
		}
		
	}
	
	static class BabyShark{
		
		int x,y;
		int size;
		int be;
		
		public BabyShark(int x, int y, int size, int be) {
			
			this.x = x;
			this.y = y;
			this.size = size;
			this.be = be;
			
		}	
		
	}

	
	static class Info implements Comparable<Info>{
		
		int x,y;
		int cnt;
		
		public Info(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
		
		@Override
		public int compareTo(Info arg0) {
			// TODO Auto-generated method stub
			
			if( this.y < arg0.y) {
				return -1;
			}else if(this.y == arg0.y) {
				
				if(this.x <= arg0.x) {
					return -1;
				}else {
					return 1;
				}
				
			}else {
				return 1;
			}			
			
			
		}
		
		
	}
	
	
}
