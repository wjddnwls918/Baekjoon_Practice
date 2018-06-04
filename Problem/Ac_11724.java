import java.util.Scanner;

public class Ac_11724 {

	static int N,M;
	
	static int x[],y[];
	
	static int map[][];
	static int check[];
	
	static int cnt;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		N = in.nextInt();
		M = in.nextInt();
		
		x = new int[M];
		y = new int[M];
		map = new int[N+1][N+1];
		
		
		for(int i=0; i<M; i++)
		{
			x[i] = in.nextInt();
			y[i] = in.nextInt();
			
			map[y[i]][x[i]] = 1;
			map[x[i]][y[i]] = 1;
			
		}
		
		check = new int[N+1];
		
		for(int i=1; i<=N; i++)
		{			
				if(check[i]!=1)
				{									
					dfs(i);
					cnt++;
				}				
			
		}
		
		
		System.out.println(cnt);
		
		
	}
	
	public static void dfs(int num)
	{		
		check[num] = 1;		
		
		for(int i = 1; i<=N; i++ )
		{
			if(map[num][i]==1 && check[i]!=1)
			{
				
				dfs(i);				
			}				
		}		
		
	}

}
