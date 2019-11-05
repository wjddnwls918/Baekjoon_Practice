import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Ac_6588 {

	
	static boolean isPrime[];
	static StringBuilder out;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		out = new StringBuilder();
		
		isPrime = new boolean[1000001];
		findPrime();

		/*for(int i=0; i<5; i++)
			System.out.println(primeList.get(i));*/
		

		while(true) {
			
			
			
			int n = Integer.parseInt(in.readLine());
			
			if(n == 0)
				break;
			
			checkGoldBach(n);
			
			
		}
		
		System.out.println(out);
		
	}
	
	public static void findPrime() {
		
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		
		for(int i=2; i<=Math.sqrt(1000000); i++) {
			
			if(isPrime[i]) {
				
				for(int j=i*i; j<=1000000; j+=i) {
					isPrime[j] = false;
					
				}
				
			}
			
		}
		
		//System.out.println("count : "+ count);
		
	}

	
	public static void checkGoldBach(int n) {
		
		
		for(int i=3; i<n; i+=2) {
			
			if(isPrime[i] && isPrime[n-i]) {
				int left = Math.min(i, n-i);
				int right = Math.max(i, n-i);
				out.append(n +" = "+left +" + "+right+"\n");
				return;
			}
			
		}
		out.append("Goldbach's conjecture is wrong.\n");
	}
	


}
