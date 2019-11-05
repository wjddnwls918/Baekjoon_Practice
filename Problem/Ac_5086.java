import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5086 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		
		
		while (true) {
			input = in.readLine().split(" ");
			
			int A,B;
			A = Integer.parseInt(input[0]);
			B = Integer.parseInt(input[1]);
			
			if(A == 0 && B == 0)
				break;
			
			if(B % A == 0) {
				System.out.println("factor");
			} else if( A % B == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
			
		}
		
	}

}
