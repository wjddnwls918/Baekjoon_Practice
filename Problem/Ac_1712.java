import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1712 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long A,B,C;
		String input[] = in.readLine().split(" ");
		
		A = Long.parseLong(input[0]);
		B = Long.parseLong(input[1]);
		C = Long.parseLong(input[2]);
		
		long parent,child;
		
		child = C-B;
		parent = A;
		
		if( C-B==0   || A / (C-B) <0)
			System.out.println(-1);
		else {
			System.out.println( (A/(C-B)) + 1);
		}
		
	}

}
