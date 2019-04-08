import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_5596 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String input[];
		int S,T;
		S = 0;
		T = 0;
		
		input = in.readLine().split(" ");
		for(int i=0; i<4; i++) {
			S += Integer.parseInt(input[i]);
		}
		
		input = in.readLine().split(" ");
		for(int i=0; i<4; i++) {
			T += Integer.parseInt(input[i]);
		}
		
		
		if( S>= T) {
			System.out.println(S);
		}else {
			System.out.println(T);
		}
		
	}

}
