package notyet;

import java.io.BufferedReader;
import java.io.InputStreamReader;



public class PS_10870 {

	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int N = Integer.parseInt(in.readLine());	
		
		System.out.println(fibo(N));
	}
	
	public static int fibo(int n) {
		
		if(n == 0)
			return 0;
		
		if(n == 1)
			return 1;
		
		
		return fibo(n-1) + fibo(n-2);
		
	}

}
