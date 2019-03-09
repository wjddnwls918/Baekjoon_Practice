import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Ac_15664 {
	
		static int N,M;
	
		static int num[];
		static int check[];		
		static int combi[];
		
		static List<String> list;
		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String temp[];
		temp = in.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		
		num = new int[N];
		check = new int[10001];
		combi = new int[N];
		
		temp = in.readLine().split(" ");
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(temp[i]);
		}
		Arrays.sort(num);
		
		list = new ArrayList<>();
		
		dfs(0,0);		

		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	public static void dfs(int depth, int pos) {
		
		if( depth == M) {
			String temp = "";
			
			for(int i=0; i<M; i++) {
				temp += combi[i];
					
				if(i != M-1)
					temp += " ";					
			}
			
			if(!list.contains(temp))
				list.add(temp);
			
		} else {
			
			for(int i=pos; i<N; i++) {
				if(check[i] != 1 && combi[depth] == 0) {
					check[i] = 1;
					combi[depth] = num[i];
					dfs(depth+1, i+1);
					combi[depth] = 0;
					check[i] = 0;
				}
			}			
		}
		
	}

}


//Á¤´ä