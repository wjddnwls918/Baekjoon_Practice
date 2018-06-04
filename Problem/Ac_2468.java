import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2468 {

		static int N;
		static int map[][];
		static int check[][];
		static int dx[] = {0, 1, 0, -1};
		static int dy[] = {-1, 0, 1, 0};
		static int cnt;
		static int depth;
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		map = new int[N][N];
		
		String temp[];
		for(int i=0; i<N; i++)
		{
			temp = in.readLine().split(" ");
			for(int j=0; j<N; j++)
			{
				map[i][j] = Integer.parseInt(temp[j]);
			}
		}
		
		int prev=0;
		for(int k=0; k<=100; k++)
		{
			depth = k;
		
			check = new int[N][N];
			cnt = 0;
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<N; j++)
				{
					if(map[i][j] > depth && check[i][j] != 1)
					{
						dfs(j,i);
						cnt++;
					}
				}
			}
			
			if(prev > cnt)
			{
				break;
			}
			prev = cnt;
			
		}
		
		System.out.println(prev);
			
		
	}
	public static void dfs(int x, int y)
	{
		int newx,newy;
		check [y][x] = 1;
		for(int i=0; i<4; i++)
		{
			newx = x + dx[i];
			newy = y + dy[i];
			if(newx >=0 && newx <N && newy>=0 && newy <N && map[newy][newx] > depth && check[newy][newx]!= 1)
			{
				dfs(newx,newy);				
			}			
		}
		
	}

}


//조건도 이상하고 어떻게 해야되는건지 ..
