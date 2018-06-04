import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Ac_1261 {

		static int N,M;
		
		static int map[][];
		static int check[][];
	
		static PriorityQueue<Info> que;
		
		static int dx[] = {0, 1, 0, -1};
		static int dy[] = {-1, 0, 1, 0};
		
		static int result;
		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[];
		temp = in.readLine().split(" ");
	
		M = Integer.parseInt(temp[0]);
		N = Integer.parseInt(temp[1]);
		
		String str;
		
		map = new int[N+1][M+1];
		check = new int[N+1][M+1];
		for(int i=1;i<=N; i++)
		{
			str = in.readLine();
			for(int j=1; j<=M; j++)
			{
				map[i][j] = Integer.parseInt(""+str.charAt(j-1));
			}
		}
		
		que = new PriorityQueue(new Comparator<Info>() { 
			
			@Override
			public int compare(Info i1, Info i2) {
            if(i1.cnt > i2.cnt)
                return 1;
            else if(i1.cnt < i2.cnt)
                return -1;
            return 0;
        }});
		
		que.add(new Info(1,1,0));
		check [1][1] = 1;
		Info tem;
		result = 0;
		while(!que.isEmpty())
		{
			
			tem = que.poll();
			int newx,newy;
			
			if(tem.x == M && tem.y == N )
			{
				result = tem.cnt;
				break;				
			}
			
			for(int i=0; i<4; i++)
			{
				newx = tem.x + dx[i];
				newy = tem.y + dy[i];
				if(newx>=1 && newx <=M && newy>=1 && newy <=N && check[newy][newx]!=1 )
				{
					check[newy][newx] = 1;
					if(map[newy][newx] == 1)
					{					
						map[newy][newx] = 0;
						que.add(new Info(newx,newy,tem.cnt+1));
					}
					else
					{											
						que.add(new Info(newx,newy,tem.cnt));
					}
					
				}
			}
		}
		
		System.out.println(result);
		
	}
		
	static class Info
	{
		int x,y,cnt;
		
		public Info(int x, int y, int cnt)
		{
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}
	}

}
