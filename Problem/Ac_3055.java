import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Ac_3055 {
	
		static int R,C;
		static char map[][];		
		static int spreadC[][];
		static int check[][];
		static Queue<Info> wa;
		static Queue<Info> b;

		static int curx,cury;
		static int endx,endy;
		
		static boolean isfind;
		
		static int dx[] = {0, 1, 0, -1};
		static int dy[] = {-1, 0, 1, 0};
		
		static String result;		

		static boolean outflag;
		
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[];
		temp = in.readLine().split(" ");	
		R = Integer.parseInt(temp[0]);
		C = Integer.parseInt(temp[1]);
		
		map = new char[R][C];
		wa = new LinkedList();	
		String tem;
		for(int i=0; i<R; i++)
		{
			tem = in.readLine();
			for(int j=0; j<C; j++)
			{
				map[i][j] = tem.charAt(j);
				if (map[i][j] == 'S')
		        {
		               curx = j; 
		               cury = i;
		        }
		        if (map[i][j] == 'D')
		        {
		        	   endx = j; 
		               endy = i;
		        }
		        if (map[i][j] == '*')
		        {
		           wa.add(new Info(j, i));
		        }
		
				
			}
		}
		
	
		b = new LinkedList();		
		
		check = new int[R][C];
		check[cury][curx] = 1;	
		
		b.add(new Info(curx,cury,0));	   
		    
		result = "";
		solve();
		
		if(result.equals(""))
			result = "KAKTUS";
		
		System.out.println(result);
	}

	public static void solve()
	{
		Info cur;	
		while (!b.isEmpty())
		{		    
				int wsize = wa.size();
				int bsize = b.size();
			
		        //물을 확장해보자
		        while (wsize-- > 0)
		        {
		        	cur = wa.poll();
		            		            
		            for (int i = 0; i < 4; i++)
		            {
		                int newx = cur.x + dx[i];
		                int newy = cur.y + dy[i];		                
		                if (newx < 0 || newy < 0 || newx >= C || newy >= R)
		                    continue;		                
		                if (map[newy][newx] == '.') {
		                    map[newy][newx] = '*';
		                    wa.add(new Info(newx, newy));
		                }
		            }
		        }
		        //비버도 움직여보자.
		        while (bsize-- > 0)
		        {
		        	cur = b.poll();
		           
		            for (int i = 0; i < 4; i++)
		            {
		                int newx = cur.x + dx[i];
		                int newy = cur.y + dy[i];
		                //범위를 벗어나면 아무것도 하지말자
		                if (newx < 0 || newy < 0 || newx >= C || newy >= R)
		                    continue;
		                //범위 내에 있다면, 다음칸의 정보를 확인해보자.
		                if (map[newy][newx] == '.' || map[newy][newx] == 'S' || map[newy][newx] == 'D')
		                {
		                    //다음칸이 갈 수 있는 공백이거나, 친구인 비버의 굴 이라면
		                    if (check[newy][newx] == 0)
		                    {
		                        check[newy][newx] = 1;
		                        b.add(new Info(newx, newy,cur.time+1));
		                    }
		                    //비버를 만났으니까 물의 상태를 볼것도없이 성공이다.
		                    if (newx == endx && newy == endy)
		                    {		                    	
		                    	result = Integer.toString(cur.time+1);
		                    	return;
		                    }
		                }
		            }		            
		         
		        }
		        
		     
		    }
	}
	
	static class Info
	{
		int x,y;
		int time;
		
		public Info(int x,int y)
		{
			this.x = x;
			this.y = y;			
			
		}
		public Info(int x,int y, int time)
		{
			this.x = x;
			this.y = y;
			this.time = time;
		}
		
	}
	
}
