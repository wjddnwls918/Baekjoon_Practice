import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

//상범 빌딩

public class Ac_6593 {

	static int L,R,C;
	static char map[][][];
	static int check[][][];
	
	static int s[];
	static int d[];
	
	//상 하 동 서 남 북
	static int dx[] = {0, 0, 1, -1, 0, 0};
	static int dy[] = {0, 0, 0, 0, 1, -1};
	static int dz[] = {1, -1, 0, 0, 0, 0};
	
	static Queue<Info> que;
	static int result;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[];
		
		while(true) {
			temp = in.readLine().split(" ");
			L = Integer.parseInt(temp[0]);
			R = Integer.parseInt(temp[1]);
			C = Integer.parseInt(temp[2]);
			
			
			if(L == 0 && R == 0 && C == 0)
				break;
			
			map = new char[R][C][L];
			check = new int[R][C][L];
			
			s = new int[3];
			d = new int[3];
			
			for(int i=L-1; i>=0; i-- ) {
				
				for(int j=0; j<R; j++) {
					String tem = in.readLine();
					for(int k=0; k<C; k++) {
						map[j][k][i] = tem.charAt(k);
						if(map[j][k][i] == 'S') {
							s[0] = i;
							s[1] = j;
							s[2] = k;
						}else if(map[j][k][i] == 'E') {
							d[0] = i;
							d[1] = j;
							d[2] = k;
						}else if(map[j][k][i] == '#') {
							check[j][k][i] = 1;
						}
					}
				}
				in.readLine();
				
			}
			
			que = new ArrayDeque<>();
			check[s[1]][s[2]][s[0]] = 1;
			que.add(new Info(s[2],s[1],s[0],0));
			result = 0;
			bfs();
			
			
			if(result == 0) {
				System.out.println("Trapped!");
			}else {
				System.out.println("Escaped in "+result+" minute(s).");
			}
		
		}
		
	}
	
	public static void bfs() {		
		
		while (!que.isEmpty()) {
			
			Info temp = que.poll();
			
			if(temp.x == d[2] && temp.y == d[1] && temp.z == d[0]) {
				result = temp.cnt;
				break;
			}
			
			for(int i=0; i<6; i++) {				
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];
				int nz = temp.z + dz[i];
				
				if(nx>=0 && nx <C && ny>=0 && ny<R && nz>=0 && nz<L && check[ny][nx][nz] != 1) {
					
					check[ny][nx][nz] = 1;
					que.add(new Info(nx,ny,nz,temp.cnt+1));
					//check[ny][nx][nz] = 0;
					
				}
				
			}
			
		}
		
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

//정답
//메모리 실행시간 양호
