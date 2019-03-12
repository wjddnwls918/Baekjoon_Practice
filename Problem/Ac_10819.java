import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10819 {

	static int N;
	static int num[];
	static int check[];
	static int combi[];
	
	static int max;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());

		num = new int[N];
		check = new int[N];
		combi = new int[N];

		String temp[];
		temp = in.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(temp[i]);
		}

		max = -987654321;
		
		for (int i = 0; i < N; i++) {
			check = new int[N];
			combi = new int[N];
			check[i] = 1;
			combi[0] = num[i];
			dfs(1);

		}
		
		System.out.println(max);

	}

	public static void dfs( int depth) {
		
		if(depth == N) {
			//System.out.println("check");
			
			int result = 0;
			/*for(int i=0; i<N; i++) {
				System.out.print(combi[i]);
				if(i == N) 
					System.out.println();
				else
					System.out.print(" ");
			}*/
			
			for(int i=0; i<N-1; i++) {
				result += (Math.abs(combi[i] - combi[i+1]));
			}
			
			if( max < result)
				max = result;
			
		}else {
			
			for(int i=0; i<N; i++) {
				
				if(check[i] != 1) {
					check[i] = 1;
					combi[depth] = num[i];
					dfs(depth +1);
					combi[depth] = 0;
					check[i] = 0;					
				}			
			}		
		}
		
		
	}

}


//Á¤´ä
