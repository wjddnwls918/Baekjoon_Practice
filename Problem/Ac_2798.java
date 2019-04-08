import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2798 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input= in.readLine().split(" ");
		
		int N,M;
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		int card[] = new int[N];
		input = in.readLine().split(" ");
		for(int i=0; i<N; i++) {
			card[i] = Integer.parseInt(input[i]);
		}
		
		int result = 0;
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N ; k++) {
					int curSum = 0;
					curSum += card[i];
					curSum += card[j];
					curSum += card[k];
					
					if(result < curSum && curSum <= M) {
						result = curSum;
					}
					
				}
			}
		}
		
		System.out.println(result);
		
		
	}

}
