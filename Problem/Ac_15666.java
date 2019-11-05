import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ac_15666 {

	static int N, M;
	static int arr[];
	
	static LinkedHashSet<String> set;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		arr= new int[N];
		input = in.readLine().split(" ");
		for(int i=0; i<N ;i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		Arrays.sort(arr);
	
		set = new LinkedHashSet<>();
		dfs(0,0,"");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	public static void dfs(int depth,int pos, String str) {
		
		if(depth == M) {
			set.add(str);
			return;
		} else {
			
			for(int i=pos; i<N; i++) {
				
				dfs(depth+1,i,str+arr[i]+" ");
				
			}
			
		}
		
	}

}
