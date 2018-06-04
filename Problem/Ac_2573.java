import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2573 {

		static int N,M;
		static int map[][];
		static int newmap[][];
		static int check[][];
		static int dx[] = {0, 1, 0, -1};
		static int dy[] = {-1, 0, 1, 0};
		
		static int cnt;
		static int result;
		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[];
		temp = in.readLine().split(" ");
		
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		
		map = new int[N][M];
		for(int i=0; i<N; i++)
		{
			temp = in.readLine().split(" ");
			for(int j=0; j<M; j++)
			{
				map[i][j] = Integer.parseInt(temp[j]);				
			}
		}

		int time=1;
		int tem=0;
		check = new int[N][M];

		while(true)
		{
			newmap = new int[N][M];
			boolean outflag =true;
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<M; j++)
				{
					if(map[i][j] != 0)
					{
						sub(j,i);
						outflag = false;
					}
				}
			}
			
			// ㅅ ㅣ  발 ... 이것때문에 ..
			if(outflag)
			{
				result = 0;
				break;
			}
			
			check = new int[N][M];
			cnt =0;
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<M; j++)
				{
					if(newmap[i][j] != 0 && check[i][j] !=1)
					{
						dfs(j,i,newmap);
						cnt++;						
					}
				}
			}
			if(cnt >= 2 )
			{
				result = time;
				break;
			}
			
			copy(newmap,map);
		
						
			time ++;
		}
		
		System.out.println(result);
	}
	public static void copy(int src[][], int dst[][])
	{
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)
			{
				dst[i][j] = src[i][j];
			}
		}		
	}
	public static void sub(int x, int y) {
		
		int newx,newy;
		int cnt=0;
		for(int i=0; i<4; i++)
		{
			
			newx = x + dx[i];
			newy = y + dy[i];
			if(newx>=0 && newx <M && newy>=0 && newy <N )
			{
				if(map[newy][newx] == 0)
					cnt++;
			}		
		}
		
		newmap[y][x] = map[y][x] - cnt;
		if(newmap[y][x] < 0)
			newmap[y][x] = 0;
		
	}
	
	public static void dfs(int x, int y, int map[][])
	{
		check[y][x] = 1;
		
		int newx,newy;
		for(int i=0; i<4; i++)
		{
			
			newx = x + dx[i];
			newy = y + dy[i];
			
			if(newx>=0 && newx<M && newy>=0 && newy < N )
			{
				if(map[newy][newx] != 0 && check[newy][newx] != 1)
				{				
				dfs(newx,newy,map);
				}
			}
			
		}
	}

}


//빙산
