import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ac_2178 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int dx[] = {-1,0,1,0};
		int dy[] = {0,1,0,-1};
		int map[][] = new int[n+1][m+1];
		int c[][] = new int[n+1][m+1];
		int d[][] = new int[n+1][m+1];
		
		String temp[]  = new String[n];
		
		for(int i=0; i<n; i++)
		{
			temp[i] = in.next();
		}
		
		int cnt=0;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=temp[i-1].length(); j++)
			{
				map[i][j] = Integer.parseInt("" +temp[i-1].charAt(j-1));
			}
		}
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=m; j++)
			{
				System.out.print(map[i][j] +" ");
			}
			System.out.println();
		}
		
		Queue<Integer> qx = new LinkedList<>();
		Queue<Integer> qy = new LinkedList<>();
		
		qx.add(1);
		qy.add(1);
		c[1][1] = 1;
		d[1][1] = 1;
		
		int nowx=0,nowy=0,nextx=0,nexty=0;
		
		while(!qx.isEmpty())
		{
			nowx = qx.poll();
			nowy = qy.poll();
			
			for(int i=0; i<4; i++)
			{
				if( (nowx+dx[i] <= n && nowy+dy[i] <=m) && map[nowx+dx[i]][nowy+dy[i]]==1 && c[nowx+dx[i]][nowy+dy[i]]!=1 )
				{
					qx.add(nowx+dx[i]);
					qy.add(nowy+dy[i]);
					d[nowx+dx[i]][nowy+dy[i]] += d[nowx][nowy]+1;
					c[nowx+dx[i]][nowy+dy[i]] =1;
				}
			}
			
		}
		
		System.out.println(d[n][m]);
		
	}

}
