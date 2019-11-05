import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2909 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input =in.readLine().split(" ");
		int C;
		int K;
		C = Integer.parseInt(input[0]);
		K = Integer.parseInt(input[1]);
		
		double trans = C % Math.pow(10, K);
		System.out.println(trans);
		
		if(trans >= 5) {
			
		} else {
			
		}
		
		//System.out.println(result);
	}

}

//¸øÇ°