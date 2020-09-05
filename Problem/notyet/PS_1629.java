package notyet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PS_1629 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	static long A,B,C;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		String input[] = in.readLine().split(" ");
		A = Long.parseLong(input[0]);
		B = Long.parseLong(input[1]);
		C = Long.parseLong(input[2]);
		
		
		BigInteger num = new BigInteger(Long.toString(A));
		BigInteger multiNum = new BigInteger(Long.toString(A));
		for(long i =0; i<B; i++) {
			
			num = num.multiply(multiNum);
			
		}
		
		System.out.println(num.mod(new BigInteger(Long.toString(C))));
		
		
	}

}
