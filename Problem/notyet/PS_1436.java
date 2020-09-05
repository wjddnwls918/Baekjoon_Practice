package notyet;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PS_1436 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	static int N;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		N = Integer.parseInt(in.readLine());

		long title = 0;

		int count = 0;
		while (true) {
			String str = Long.toString(title);			

			if (str.indexOf("666") >= 0) {				
				count += 1;
			}
			
			 title += 1;
			 
			if(count == N) {
				System.out.println(str);
				break;
			}
		}

	}

}
