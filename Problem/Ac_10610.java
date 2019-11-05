import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10610 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		String input = in.readLine();
		int num[] = new int[10];
		
		int sum = 0;
		for(int i=0; i<input.length(); i++) {
			int cur = input.charAt(i) - '0';
			num[cur]+=1;
			sum += cur;
		}
		
		
		if(num[0] ==0 || sum %3 != 0) {
			System.out.println(-1);
			return;
		}
		
		
		for(int i=9; i>=0; i--) {
			for(int j=0; j<num[i]; j++) {
				out.append(i);
			}
		}
		out.append("\n");
		
		System.out.println(out);
		
	}

}
