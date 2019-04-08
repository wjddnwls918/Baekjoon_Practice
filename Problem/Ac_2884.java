import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2884 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int H,M;
		String input[];
		input = in.readLine().split(" ");
		H = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		M -= 45;
		if( M < 0) {
			M = 60 - Math.abs(M);
			
			H -= 1;
			if(H < 0)
				H = 23;			
		}
		
		System.out.println(H+" "+M);
		
	}

}
