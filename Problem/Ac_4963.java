import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_4963 {
	
	static int w,h;
	static int map[][];
	static int check[][];
	
	//위 오른위 오른 오른아래 아래 왼아래 왼 왼위
	static int dx[] = {0, 1, 1, 1, 0, -1, -1 ,-1};
	static int dy[] = {-1, -1, 0, 1, 1, 1, 0, -1};

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[];
		while(true) {
			temp = in.readLine().split(" ");
			w = Integer.parseInt(temp[0]);
			h = Integer.parseInt(temp[1]);
			
			if(w==0 && h==0) {
				break;
			}
			
			map = new int[h][w];
			check = new int[h][w];
		
			for(int i=0; i<h; i++) {
				temp = in.readLine().split(" ");
				for(int j=0; j<w; j++) {
					map[i][j] = Integer.parseInt(temp[j]);
				}
			}
			
			int iCnt = 0;
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(map[i][j] == 1 && check[i][j] != 1) {
						dfs(j, i);
						iCnt++;
					}
				}
			}
			System.out.println(iCnt);
		}
		
	}
	
	public static void dfs(int x, int y) {
		for(int i=0; i<8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx >= 0 && nx <w && ny >=0 && ny <h && map[ny][nx] == 1 && check[ny][nx] != 1) {
				check[ny][nx] = 1;
				dfs(nx,ny);
			}
		}
	}

}
