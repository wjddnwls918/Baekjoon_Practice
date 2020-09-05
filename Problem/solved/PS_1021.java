package solved;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class PS_1021 {

	static int N, M;
	static BufferedReader in;

	static int findNum[];

	static LinkedList<Integer> deque;
	
	static int result;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		makeInput();
		solveProblem();
		
		System.out.println(result);
	}

	public static void makeInput() throws Exception {
		in = new BufferedReader(new InputStreamReader(System.in));

		String input[];

		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);

		findNum = new int[M];
		input = in.readLine().split(" ");
		for (int i = 0; i < M; i++) {
			findNum[i] = Integer.parseInt(input[i]);
		}

		
		deque = new LinkedList<>();
		
		for(int i=1; i<=N; i++) {
			deque.add(i);
		}
		
	}

	public static void solveProblem() {
		
		

		for(int i=0; i<findNum.length; i++) {
			if(deque.indexOf(findNum[i]) == 0) {
				deque.pollFirst();
			}else {
				int curIndex = deque.indexOf(findNum[i]);
				
				int left = curIndex;
				int right = deque.size()-curIndex;
				
				if(left < right) {
					result += left;
					
					for(int j=0; j<left; j++) {
						turnLeft();
					}
					
					deque.pollFirst();
					
				}else {
					result += right;
					
					for(int j=0; j<right; j++) {
						turnRight();
					}
					
					deque.pollFirst();					
				}
				
				
			}
		}
		
	}

	public static void turnLeft() {
		int first = deque.pollFirst();

		deque.add(first);

	}

	public static void turnRight() {
		int last = deque.pollLast();
		deque.addFirst(last);
	}

}

//¸Â¾ÒÀ½
