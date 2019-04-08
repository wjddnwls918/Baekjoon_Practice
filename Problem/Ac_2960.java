import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_2960 {

		static int isPrime[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = in.readLine().split(" ");
		int N,K;
		N = Integer.parseInt(temp[0]);
		K = Integer.parseInt(temp[1]);
		
		isPrime = new int[N+1];
		Arrays.fill(isPrime, 1);
		
		boolean isEnd =false;
		int cnt =0;
		int result =0;
		for(int i=2; i<=N; i++) {
			for(int j=i; j<=N; j+=i) {
				if(isPrime[j] == 0)
					continue;
				
				isPrime[j] = 0;
				cnt += 1;
				
				if(cnt == K) {
					isEnd = true;
					result = j;
					break;
				}
				
			}
			
			if(isEnd)
				break;
		}
		System.out.println(result);
	}

}
