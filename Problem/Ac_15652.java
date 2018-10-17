import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_15652 {

		static int N,M;
		static int combi[];
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String tem[] = in.readLine().split(" ");
		
		N = Integer.parseInt(tem[0]);
		M = Integer.parseInt(tem[1]);
		
		combi = new int[M];
		
		for(int i=1; i<=N; i++) {
			
			combi[0] = i;
			dfs(0,i);
			combi[0] = 0;			
		}
		
	}

	public static void dfs(int depth,int num) {
		
		if(depth == M-1) {
			for(int i=0; i<M; i++) {
				
				System.out.print(combi[i]);
				
				if(i == M-1)
					System.out.println();
				else
					System.out.print(" ");
			}
		}else {
			
			
			for(int i=num; i<=N; i++) {
				
				combi[depth+1] = i;
				dfs(depth+1, i);
				combi[depth+1] = 0;
				
			}
			
			
		}
		
	}
	
}

//정답 시간좀 길다..
