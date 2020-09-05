package notyet;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PS_11401 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	static int N,K;
	
	static long map[][];
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String input[] = in.readLine().split(" ");

		N = Integer.parseInt(input[0]);
		K = Integer.parseInt(input[1]);
		
		map = new long[N+1][N+1];
		
		solveProblem();
	}
	
	public static void solveProblem() {
		
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				if(i < j)
					continue;
				
				if(j==0 || i==j) {
					map[i][j] = 1;
				}else {					
					map[i][j] = (map[i-1][j] + map[i-1][j-1])%1000000007;					
				}
				
				//System.out.println("i : " + i + " j : "+ j);
				
				if(i==N && j == K) {
					System.out.println(map[i][j]);
					return;
				}
			}
		}
		
	}

}
