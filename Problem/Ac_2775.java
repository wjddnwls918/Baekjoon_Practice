import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2775 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());
		
		int result[][] = new int[15][15];
		
		for(int i=1; i<=14; i++) {
			result[0][i] = i;
			result[i][1] = 1;
		}

		
		for(int i=1; i<=14; i++) {
			for(int j=2; j<=14; j++) {
				for(int k=1; k<=j; k++) {
					result[i][j] += result[i-1][k];
				}
			}
		}
		for (int tc = 1; tc <= T; tc++) {
			int n,k;
			
			n = Integer.parseInt(in.readLine());
			k = Integer.parseInt(in.readLine());
		
			System.out.println(result[n][k]);
			
		}

	}

}
