import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2475 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = in.readLine().split(" ");
		
		int sum = 0;
		for(int i=0; i<input.length; i++) {
			int cur = Integer.parseInt(input[i]);
			sum += Math.pow(cur, 2);
		}
		
		System.out.println(sum%10);
		
	}

}
