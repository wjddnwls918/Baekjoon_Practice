import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_15655 {

		static int N,M;
		static int num[];
		static int combi[];
		static int check[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String tem[];
		tem = in.readLine().split(" ");
		
		N = Integer.parseInt(tem[0]);
		M = Integer.parseInt(tem[1]);
		
		num = new int[N];
		
		tem = in.readLine().split(" ");
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(tem[i]);
		}
		combi = new int[M];
		check = new int[N];
		
		Arrays.sort(num);
		
		
		for(int i=0; i<N; i++) {
			
			check[i] = 1;
			combi[0] = num[i];
			dfs(1,num[i]);
			combi[0] = 0;
			check[i] = 0;
		}
		
		
	}
	public static void dfs(int cnt,int pre) {
		
		if(cnt == M) {
			
			for(int i=0; i<M; i++) {
				System.out.print(combi[i]);
				if(i == M-1)
					System.out.println();
				else
					System.out.print(" ");						
			}
			
			
		}else {
			
			for(int i=0; i<N; i++) {
				if(check[i] != 1 && num[i] > pre) {
					
					check[i] = 1;
					combi[cnt] = num[i];
					dfs(cnt+1 , num[i]);
					combi[cnt] = 0;
					check[i] = 0;
					
				}
			}
			
		}
		
		
	}

}
