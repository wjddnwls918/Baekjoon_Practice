package solved;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;


public class PS_1655 {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static StringBuilder out = new StringBuilder();
	
	static int N;
	
	static PriorityQueue<Integer> minHeap;
	static PriorityQueue<Integer> maxHeap;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		solveProblem();
		
		System.out.print(out);
	}
	
	public static void solveProblem() throws Exception {
	
		N = Integer.parseInt(in.readLine());
		
		minHeap = new PriorityQueue<Integer>();
		maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0; i<N; i++) {			
			
			int num = Integer.parseInt(in.readLine());
			
			if(maxHeap.size() > minHeap.size())
				minHeap.add(num);
			else
				maxHeap.add(num);
			
			if(!maxHeap.isEmpty() && ! minHeap.isEmpty() && minHeap.peek() < maxHeap.peek()) {
				int maxTop = maxHeap.poll();
				int minTop = minHeap.poll();
				
				maxHeap.add(minTop);
				minHeap.add(maxTop);				
			}
				
				
			out.append(maxHeap.peek()+"\n");
			
		}
	}
	

}

//가운데를 말해요

//중간값찾는 문제

// 두개 우선순위 큐를 사용해서 
//하나는 출력용으로 사용하는데 ..
