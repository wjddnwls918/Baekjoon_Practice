import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2748 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		long fib[] = new long[91];
		fib[0] = 0;
		fib[1] = 1;
		
		if(n < 2) {
			System.out.println(fib[n]);
		} else {
			for(int i=2; i<=n; i++) {
				fib[i] = fib[i-1]+fib[i-2];
			}
			
			System.out.println(fib[n]);
		}		
		
	}

}
