import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Ac_2935 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BigInteger A,B;
		char op;
		
		A = new BigInteger(in.readLine());
		op = in.readLine().charAt(0);
		B = new BigInteger(in.readLine());
		
		if(op == '*') {
			System.out.println(A.multiply(B));
		}else {
			System.out.println(A.add(B));
		}
	}

}
