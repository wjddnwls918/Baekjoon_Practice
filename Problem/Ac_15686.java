import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ac_15686 {

      static int N,M;
      
      static int map[][];
      
      static int combi[];
      
      static int check;
      
      static int hcnt,bcnt;
      static ArrayList<Info> harr;
      static ArrayList<Info> barr;
      
      static int result;
      
   public static void main(String[] args) throws Exception {
      // TODO Auto-generated method stub
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String temp[];
      temp = in.readLine().split(" ");
      N = Integer.parseInt(temp[0]);
      M = Integer.parseInt(temp[1]);
      
      map = new int[N][N];
      hcnt = 0;
      bcnt = 0;
      
      harr = new ArrayList();
      barr = new ArrayList();
      
      for(int i=0; i<N; i++)
      {
         temp = in.readLine().split(" ");
         for(int j=0; j<N; j++)
         {
            map[i][j] = Integer.parseInt(temp[j]);
            if(map[i][j] == 1)
            {
            	 hcnt++;
                 harr.add(new Info(j,i));
            }
            if(map[i][j] == 2)
            {
            	 bcnt ++;
                 barr.add(new Info(j,i));
              
            }
         }
      }
   
      combi = new int[M];
      result = 987654321;
      for(int i=0; i<bcnt; i++)
      {
         check |= 1<<i;
         combi[0] = i;
         dfs(i,0);
         combi[0] = 0;
         check &= ~(1<<i);
      }
      
      System.out.println(result);
   }
      
   static class Info
   {
      int x,y;
      public Info(int x, int y)
      {
         this.x = x;
         this.y = y;
      }
   }
   
   public static void dfs(int pos, int depth)
   {
      if(depth == M-1)
      {
   
         
         int dis;
         int min;
         int sum = 0;
         for(int i = 0; i<hcnt; i++)
         {
             min = 987654321;
            for (int j=0; j<M; j++)
            {
               dis = Math.abs(harr.get(i).x - barr.get(combi[j]).x) + Math.abs(harr.get(i).y-barr.get(combi[j]).y);
               if(min > dis)
                  min = dis;
               
            }
            
            sum += min;
         }
         
         if(result > sum)
            result = sum;
         
      }
      else
      {
         for(int i=pos+1; i<bcnt; i++)
         {
            if( (check & 1<<i) != 1<<i)
            {
            check |= 1<<i;
            combi[depth+1] = i;
            dfs(i,depth+1);
            combi[depth+1] = 0;
            check &= ~(1<<i);
            }
         }
         
      }
         
   }

}