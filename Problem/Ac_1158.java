import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Ac_1158 {
		
		static Queue<Integer> que;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N,M;
		String temp[];
		temp = in.readLine().split(" ");
		
		N= Integer.parseInt(temp[0]);
		M = Integer.parseInt(temp[1]);
		
		que = new ArrayDeque<>();
	
		System.out.print("<");
		
		for(int i=1; i<=N; i++) {
			que.add(i);
		}
		
		while(!que.isEmpty()) {
			if(que.size() == 1) {
				System.out.print(que.poll());
				break;
			}
			
			for(int i=1; i<M; i++) {
				que.add(que.poll());
			}
			System.out.print(que.poll()+", ");		
			
		}		
		
		System.out.println(">");
	}

}
