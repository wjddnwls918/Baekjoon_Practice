import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_15657 {
   
      static int N,M;
      static int num[];
      static int combi[];
      static StringBuilder out;

   public static void main(String[] args) throws Exception {
      // TODO Auto-generated method stub
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      out = new StringBuilder();
      
      String tem[];
      tem = in.readLine().split(" ");      
      N = Integer.parseInt(tem[0]);
      M = Integer.parseInt(tem[1]);
      
      
      
      
      num = new int [N];
      tem = in.readLine().split(" ");
      for(int i=0; i<N; i++) {
         num[i] = Integer.parseInt(tem[i]);
      }
      Arrays.sort(num);
      
      combi = new int[M];
      for(int i=0; i<N; i++) {
         combi[0] = num[i];
         dfs(num[i],0);
         combi[0] = 0;
      }
      
      System.out.print(out);
   }
   
   public static void dfs(int curnum, int depth) {
      
      if(depth == M-1) {
         
    	  
         for(int i=0; i<M; i++) {
            
            out.append(Integer.toString(combi[i]));
            if(i == M-1)
               out.append("\n");
            else
               out.append(" ");
            
         }
         
         
      }else {
         
         for(int i=0; i<N; i++) {
            
            if(num[i] >= curnum) {
               combi[depth+1] = num[i];
               dfs(num[i],depth+1);
               combi[depth+1] = 0;
            }            
         }
         
      }
      
      
   }

}