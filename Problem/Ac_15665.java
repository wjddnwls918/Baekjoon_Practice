import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Ac_15665 {

	static int N,M;
	static int arr[];
	static LinkedHashSet<String> set;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		String input[];
		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		input = in.readLine().split(" ");
		arr = new int[N];
		for(int i=0; i<input.length; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		
		Arrays.sort(arr);
		set = new LinkedHashSet<>();
		dfs(0,"");
		 
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			out.append(itr.next()+"\n");
		}
		System.out.println(out);
	}
	public static void dfs(int depth, String str) {
		
		if(depth == M) {
			
			set.add(str);
			
		} else {
			
			for(int i=0; i<arr.length; i++) {
				
				dfs(depth+1,str+arr[i]+" ");
				
			}
			
		}
		
	}

}
