import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Ac_11650 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		PriorityQueue<Info> pque = new PriorityQueue<>();
		String tem[];
		for(int i=0; i<N; i++) {
			tem = in.readLine().split(" ");
			
			pque.add(new Info(Integer.parseInt(tem[0]),Integer.parseInt(tem[1])));
			
		}
		
		while(!pque.isEmpty()) {
			System.out.println(pque.poll().toString());
		}
	}
	
	static class Info implements Comparable<Info>{
		int x,y;
		
		public Info(int x, int y) {
			this.x = x;
			this.y = y;
		}
		
		@Override
		public int compareTo(Info arg0) {
			// TODO Auto-generated method stub
			if(this.x == arg0.x) {
				return this.y < arg0.y ? -1:1;
			}else {
				return this.x < arg0.x ? -1:1;
			}
		}
		
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.x +" "+this.y;
		}
		
	}

}


//시간이 오래걸리네 ?? 1232ms
// 나보다 짧은 애 있음 
