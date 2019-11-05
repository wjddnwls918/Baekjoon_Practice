import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;

public class Ac_1021 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int N,M;
		String input[];
		
		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		int findNum[] = new int[M];
		input = in.readLine().split(" ");
		for(int i=0; i<M; i++) {
			findNum[i] = Integer.parseInt(input[i]);
		}
		
		
		Deque<Integer> deque = new ArrayDeque<>();
		for(int i=1; i<=N; i++) {
			deque.add(i);
		}
		
		
		int curPnt = 1;
		int count = 0;
		//HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<M; i++) {
			
					
			
			
			int left = Math.abs(findNum[i] - curPnt);
			int right = N-left;
			
		/*	
			Iterator<Integer> itr = set.iterator();
			while(itr.hasNext()) {
				
			}*/
			
			
			System.out.println("curPnt : "+curPnt +" left : "+left +" right : "+right +" size : "+deque.size());
			
			if(left > right) {
				System.out.println("check1");
				for(int j=0; j<right; j++) {
					count +=1;
					turnRight(deque);
					if(deque.peek()==findNum[i])
						break;
				}
			} else {
				System.out.println("check2");
				for(int j=0; j<left; j++) {
					count+=1;
					turnLeft(deque);
					if(deque.peek() == findNum[i])
						break;
				}
			}
			
			
			System.out.println(deque.peek());
			
			if(deque.peek() == findNum[i]) {
				deque.poll();				
				
				//set.add(findNum[i]);
				curPnt = deque.peek();
				continue;
			}
			
			
		}
		
		System.out.println(count);
		
	}	
	
	public static void turnLeft(Deque<Integer> deque) {
		int first = deque.poll();
		
		deque.add(first);
		
	}
	
	public static void turnRight(Deque<Integer> deque) {
		int last = deque.pollLast();
		deque.addFirst(last);
	}

}
