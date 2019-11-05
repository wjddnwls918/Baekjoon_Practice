import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2845 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		String input[] = in.readLine().split(" ");
		int person = Integer.parseInt(input[0]) * Integer.parseInt(input[1]);
		
		input = in.readLine().split(" ");
		for(int i=0; i<input.length; i++) {
			int cur = Integer.parseInt(input[i]);
			out.append(cur-person);
			if(i==input.length-1)
				out.append("\n");
			else
				out.append(" ");
		}
		
		System.out.println(out);
		
	}

}
