import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1929 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int M,N;
		String tem[] = in.readLine().split(" ");
		M = Integer.parseInt(tem[0]);
		N = Integer.parseInt(tem[1]);
		
		if(N == 1)
			return;
			
		
		boolean num[] = new boolean[1000001];
		for(int i=1; i<=1000000; i++) {
			num[i] = true;
		}
		
		num[1] = false;
		
		for(int i=2; (i*i)<=N; i++) {
			if(num[i]) {
				for(int j=i*i; j<=N; j+=i) {
					num[j] = false;
				}
			}
		}
		
		for(int i=M; i<=N; i++) {
			
			if(num[i])
				System.out.println(i);
		}
		
		
		
		
	}

}
