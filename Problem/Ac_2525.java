import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2525 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = in.readLine().split(" ");
		int A,B,C;
		A = Integer.parseInt(input[0]);
		B = Integer.parseInt(input[1]);
		C = Integer.parseInt(in.readLine());
		
		int over = (B+C)/60;
		
		A+=over;
		
		A %= 24;
		
		B = (B+C)%60;
		
		System.out.println(A+" "+B);
		
	}

}
