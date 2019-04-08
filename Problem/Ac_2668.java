import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ac_2668 {
	 
	static int N;
	static int arr[];
	static int check[];
	static int cnt[];
	
	static TreeSet<Integer> set;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		arr = new int[N+1];
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}
		
		set = new TreeSet<>();
		for(int i=1; i<=N ;i++) {
			check = new int[N+1];
			cnt = new int[N+1];
			dfs(i);
			
			isOk();
		}
		
		System.out.println(set.size());
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
	
	public static void isOk() {
		boolean isCheck = true;
		for(int i=1; i<=N; i++) {
			if(cnt[i] != 0 && cnt [i] != 2) {
				isCheck = false;				
				break;
			}
		}
		
		if(isCheck) {
			for(int i=1; i<=N; i++) {
				if(cnt[i] == 2)
					set.add(i);
			}
		}
		
	}
	
	public static void dfs(int pos) {
		
		//System.out.println(pos);
		check[pos] = 1;
		
		cnt[pos] += 1;
		cnt[arr[pos]] += 1;
		
		if(check[arr[pos]] != 1)
			dfs(arr[pos]);
		
	}

}
