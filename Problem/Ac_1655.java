import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Ac_1655 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		
		int N = Integer.parseInt(in.readLine());
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<N; i++) {
			int cur = Integer.parseInt(in.readLine());
			
			arr.add(cur);
			Collections.sort(arr);
			
			if(arr.size() % 2 == 0) {
				out.append(arr.get(arr.size()/2 - 1)+"\n");
			} else {
				out.append(arr.get(arr.size()/2)+"\n");
			}
			
		}
		
		System.out.println(out);
	}

}
