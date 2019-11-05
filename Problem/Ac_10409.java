import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10409 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = in.readLine().split(" ");
		int T = Integer.parseInt(input[1]);
		
		input = in.readLine().split(" ");
		int cnt =0;
		for(int i=0; i<input.length; i++) {
			int cur = Integer.parseInt(input[i]);
			if(T - cur >= 0) {
				T -= cur;
				cnt+=1;
			} else
				break;
		}
		System.out.println(cnt);
	}

}
