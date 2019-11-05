import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_2023 {

	static boolean isPrime[];

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());

		isPrime = new boolean[100000000];
		Arrays.fill(isPrime, true);

		isPrime[1] = false;

		for (int i = 2; i <= Math.sqrt(99999999); i++) {

			if (!isPrime[i])
				continue;

			for (int j = 2 * i; j <= 99999999; j += i) {
				isPrime[j] = false;
			}

		}
		
		for(int i=(int)Math.pow(10,N-1); i<(int)Math.pow(10, N); i++) {
			if(isPrime[i]) {
				String trans = Integer.toString(i);
				boolean isOk = true;
				for(int j=1; j<=trans.length(); j++) {
					int check = Integer.parseInt(trans.substring(0,j));
					if(!isPrime[check]) {
						isOk =false;
						break;
					}						
				}
				
				if(isOk)
					System.out.println(i);
			}
		}

	}
}


//메모리 초과
