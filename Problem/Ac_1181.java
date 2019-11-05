import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;

public class Ac_1181 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		
		int N = Integer.parseInt(in.readLine());
		PriorityQueue<String> que = new PriorityQueue<>(new Comparator<String>() {
			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				if(arg0.length() > arg1.length())
					return 1;
				else if(arg0.length() == arg1.length()) {
					if(arg0.compareTo(arg1) > 0) {
						return 1;
					} else 
						return -1;
				} else
					return -1;
			}
		});
		
		for(int i=0; i<N; i++) {
			que.add(in.readLine());
		}
		
		LinkedHashSet<String> set= new LinkedHashSet<>();
		
		while(!que.isEmpty()) {			
			set.add(que.poll());			
		}
		
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			out.append(itr.next()+"\n");
		}
		
		
		System.out.println(out);
		
	}	

}
