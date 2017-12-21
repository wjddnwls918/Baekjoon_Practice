import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ac_1260 {

	public static int c[];
	public static int r[][];
	public static int n;
	public static int v;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int m = in.nextInt();
		v=  in.nextInt();
		int x,y;
		r = new int[n+1][n+1];
		c = new int[n+1];
		while(m-- >0)
		{
			x = in.nextInt();
			y = in.nextInt();
			
			r[x][y] = 1;
			r[y][x] = 1;
		}		

	
		//DFS
			dfs(v);			
			Arrays.fill(c, 0);			
			System.out.println();
		//BFS
		Queue<Integer> que = new LinkedList<>();
		ArrayList<Integer> bfs = new ArrayList<>();
		

		que.add(v);
		c[v] = 1;
		int temp=0;
		System.out.print(v);
		while(!que.isEmpty())
		{
			
			temp = que.poll();		
			bfs.add(temp);
			for(int i=1; i<n+1; i++)
			{
				if( r[temp][i] == 1 && c[i] !=1)
				{
						que.add(i);	
						c[i]=1;		
						System.out.print(" "+i);
				}
			}
			
		}		
		
		
	}
	
	public static void dfs(int V)
	{
		c[V] = 1;
		System.out.print(V+" ");
		for(int j=1; j<=n; j++)
		{
			if(r[V][j] ==1 && c[j] !=1 )
			{
				dfs(j);
			}
		}
	
	}

}


//정답 !
// DFS와 BFS니까 잘 알아 둬야함
