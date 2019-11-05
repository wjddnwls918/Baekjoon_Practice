import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Ac_10814 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		PriorityQueue<Member> que = new PriorityQueue<>();
		String input[];
		for(int i=0; i<N; i++) {
			int age,priority;
			String name;
			input= in.readLine().split(" ");
			age = Integer.parseInt(input[0]);
			name = input[1];
			priority = i;
			que.add(new Member(age, name, priority));
		}
		
		
		while(!que.isEmpty()) {
			Member cur = que.poll();
			out.append(cur.age+" "+cur.name+"\n");
		}
		System.out.println(out);
	}
	
	static class Member implements Comparable<Member>{
		int age;
		String name;
		int priority;
		
		public Member(int age, String name, int priority) {
			this.age = age;
			this.name = name;
			this.priority = priority;
		}
		
		@Override
		public int compareTo(Member arg0) {
			if(this.age > arg0.age) {
				return 1;
			} else if( this.age == arg0.age) {
				
				if(this.priority > arg0.priority){
					return 1;
				} else
					return -1;
				
			} else {
				return -1;
			}
		}
		
	}

}
