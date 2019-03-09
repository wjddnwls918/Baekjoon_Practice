import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Ac_1764 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N,M;
		String temp[];
		temp = in.readLine().split(" ");
		N = Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		
		TreeSet<String> set = new TreeSet<>();
		TreeSet<String> result = new TreeSet();
		String str;
		for(int i=0; i<N; i++) {
			str = in.readLine();			
			set.add(str);
		}
		
		for(int j=0; j<M; j++) {
			str = in.readLine();			
			if(set.contains(str))
				result.add(str);
		}
		
		Iterator<String> itr = result.iterator();
		System.out.println(result.size());
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}	

}
