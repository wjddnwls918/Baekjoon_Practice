import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1389 {

		static int N,M;
		static int map[][];
		static int cal[][];
		static int check[];
		static int mincnt;
		static int gcnt;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[];
		
		temp = in.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		map = new int[N+1][N+1];
		for(int i=0; i<M ;i++)
		{
			temp = in.readLine().split(" ");
			map[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])] = 1;
			map[Integer.parseInt(temp[1])][Integer.parseInt(temp[0])] = 1;
			
		}
		
		/*for(int i=1; i<=N; i++)
		{
			for(int j=1; j<=N; j++)
			{
				System.out.print(map[i][j]);
				if(j==N)
					System.out.println();
				else
					System.out.print(" ");
			}
		}*/
		
		cal = new int[N+1][N+1];
		check = new int[N+1];
	
		for(int i=1; i<=N; i++)
		{
			for(int j=1; j<=N; j++)
			{
				mincnt = 987654321;
				gcnt = 0;
				if(i==j)
					continue;
				
				//check[j] = 1;
				dfs(i,j,0);
				//check[j] = 0;
				
				cal[i][j] = gcnt;
			}
		}
		
		
	/*	for(int i=1; i<=N; i++)
		{
			for(int j=1; j<=N; j++)
			{
				System.out.print(cal[i][j]);
				if(j==N)
					System.out.println();
				else
					System.out.print(" ");
			}
		}*/
		
		int min = 987654321;
		int index=0,sum;
		for(int i=1; i<=N; i++)
		{
			sum = 0;
			for(int j=1; j<=N; j++)
			{
				sum += cal[i][j];
			}
			
			if( min > sum)
			{
				min = sum;
				index = i;
			}
		}
		
		System.out.println(index);
	}

	public static void dfs(int num,int find,int cnt)
	{
		if(num == find)
		{
			//System.out.println("check " + cnt);
			if(mincnt > cnt)
			{
				mincnt = cnt;
				gcnt = cnt;
			}
		}
		
		else {
			for(int i=1; i<=N; i++)
			{
				//&& cnt+1 < mincnt 이거 넣어야지 시간 확줄어듬 ... 가지치기 쓸데없는거 안들어가게
				if(map[num][i]==1 && check[i] != 1 && cnt+1 < mincnt)
				{
					check[i] = 1;
					dfs(i,find,cnt+1);
					check[i] = 0;
				}
			}
		}
	}
}
