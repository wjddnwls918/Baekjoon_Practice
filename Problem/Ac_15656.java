import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_15656 {

		static int N,M;
		static int num[];
		static int combi[];
	
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
		
		Arrays.sort(num);
		
		combi = new int[M];
		
		for(int i=0; i<N; i++) {
		
		//on
			combi[0] = num[i];
			dfs(0);
			combi[0] = 0;
		
		}
		
		
	}
	public static void dfs(int cnt) {
		
		if(cnt == M-1) {
			for(int i=0; i<M; i++) {
				
				System.out.print(combi[i]);
				if(i == M-1)
					System.out.println();
				else
					System.out.print(" ");
			}
		}else {
			for(int i=0; i<N; i++) {
				
				//on
				combi[cnt+1] = num[i];
				dfs(cnt+1);
				combi[cnt+1] = 0;
				
								
			}
		}
		
	}

}
