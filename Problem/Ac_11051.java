import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_11051 {

	
	static long map[][];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = in.readLine().split(" ");
		int N,K;
		N = Integer.parseInt(input[0]);
		K = Integer.parseInt(input[1]);
		
		
		map = new long[N+1][N+1];
		
		
		for(int i=0; i<=N; i++) {
			for(int j=0; j<=N; j++) {
				
				if(i==0 || j==0) {
					map[i][j] = 1;
					continue;
				}
				
				map[i][j] = (map[i][j-1] + map[i-1][j])%10007;
				
			}
		}
		
		System.out.println(map[N-K][K]);
		
	}

}
