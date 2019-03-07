import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

//토마토

public class Ac_7569 {

	static int M,N,H;
	static int map[][][];
	static int check[][][];
	
	static Queue<Info> que;
	
	//상 하 좌 우 앞 뒤
	static int dx[] = {0, 0, -1, 1, 0, 0};
	static int dy[] = {0, 0, 0, 0, -1, 1};
	static int dz[] = {1, -1, 0, 0, 0, 0};
	
	static int max;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[];
		temp = in.readLine().split(" ");
		
		M = Integer.parseInt(temp[0]);
		N = Integer.parseInt(temp[1]);
		H = Integer.parseInt(temp[2]);
		
		//맵 초기화
		map = new int[N][M][H];
		check = new int[N][M][H];
		
		que = new ArrayDeque<>();
		
		for(int i=0; i<H; i++) {
			for(int j=0; j<N; j++) {
				
				temp = in.readLine().split(" ");
				for(int k=0; k<M; k++) {
					map[j][k][i] = Integer.parseInt(temp[k]);
					if( map[j][k][i] == 1) {
						que.add(new Info(k,j,i,0));
						check[j][k][i] = 1;
					}					
				}
			}
		}
		
		max = 0;
		bfs();		
		boolean isWell = tomatoWell();
		
	
		if(isWell) {
			System.out.println(max);
		}else {
			System.out.println(-1);
		}
		
	}
	
	public static void bfs() {
		
		while(!que.isEmpty()) {
		
			Info temp = que.poll();			
			if(max < temp.cnt)
				max = temp.cnt;
		
						for(int l=0; l<6; l++) {
							int nx = temp.x + dx[l];
							int ny = temp.y + dy[l];
							int nz = temp.z + dz[l];
							
							if(nx>=0 && nx<M && ny>=0 && ny<N && nz>=0 && nz<H && map[ny][nx][nz] == 0 && check[ny][nx][nz] != 1) {
								check[ny][nx][nz] = 1;
								map[ny][nx][nz] = 1;
								que.add(new Info(nx,ny,nz,temp.cnt+1));
								
							}						
							
						}
			
		}
		
	}
	
	public static boolean tomatoWell() {
		
		for(int i=0; i<H; i++) {
			for(int j=0; j<N; j++) {
				for(int k=0; k<M; k++) {
					
					if(map[j][k][i] == 0) {
						return false;
					}	
				}
			}
		}
		
		return true;
	}
	
	static class Info{
		int x,y,z;
		int cnt;
		public Info(int x, int y, int z, int cnt) {
			this.x = x;
			this.y = y;
			this.z = z;
			this.cnt = cnt;
		}
	}

}

//맞았음.. bfs를 초기 시작점을 한개로 생각했던 고정관념이 어디서 생긴건지 모르겠네

// 3차원 배열 bfs 
