import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Ac_10816 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		
		String input[];
		
		int N,M;
		N = Integer.parseInt(in.readLine());
		
		int num[] = new int[N];
		input= in.readLine().split(" ");
		HashMap<Integer, Integer> map = new HashMap();
		
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(input[i]);
			
			if(map.containsKey(num[i])) {
				map.put(num[i], map.get(num[i])+1);
			} else {
				map.put(num[i], 1);
			}
		}
		
		M = Integer.parseInt(in.readLine());
		input = in.readLine().split(" ");
		for(int i=0; i<M; i++) {
			int cur = Integer.parseInt(input[i]);
			
			if(map.containsKey(cur)) {
				out.append(map.get(cur));				
			} else {
				out.append(0);
			}
			
			if(i==M-1 ) {
				out.append("\n");
			} else {
				out.append(" ");
			}
			
		}
		
		System.out.println(out);
		
	}

}
