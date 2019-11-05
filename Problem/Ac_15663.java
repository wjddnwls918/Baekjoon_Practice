import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Ac_15663 {
	
		static int N,M;
	
		static int num[];
		static int check[];			
		
		static LinkedHashSet<String> set;
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[];
		temp = in.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		
		num = new int[N];
		check = new int[N];
		
		
		temp = in.readLine().split(" ");
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(temp[i]);
		}
		Arrays.sort(num);
		
		set = new LinkedHashSet();
		
		dfs(0,"");		

		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	public static void dfs(int depth, String s) {
		
		if( depth == M) {		
			set.add(s);
			return;
			
		} else {
			
			for(int i=0; i<N; i++) {
				if(check[i] != 1) {
					check[i] = 1;					
					dfs(depth+1, s+num[i]+" ");					
					check[i] = 0;
				}
			}			
		}
		
	}

}


//정답
//LinkedHashSet이 들어간대로 넣는거네 