import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Ac_10815 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		
		int N = Integer.parseInt(in.readLine());
		HashSet<Integer> check = new HashSet<>();
		String input[] = in.readLine().split(" ");
		
		for(int i=0; i<N; i++) {
			int cur = Integer.parseInt(input[i]);
			check.add(cur);
		}
		
		int M = Integer.parseInt(in.readLine());
		input = in.readLine().split(" ");
		for(int i=0; i<M; i++) {
			int cur = Integer.parseInt(input[i]);
			if(check.contains(cur)) {
				out.append(1);
			} else {
				out.append(0);
			}
			
			
			if(i == M-1) {
				out.append("\n");
			} else {
				out.append(" ");
			}
		}
		
		System.out.println(out);
		
		
	}

}
