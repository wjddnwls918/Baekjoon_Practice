import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Ac_2822 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Info> arr = new ArrayList<>();
		for(int i=1; i<=8; i++) {
			int cur = Integer.parseInt(in.readLine());
			arr.add(new Info(cur,i));
		}
		
		Collections.sort(arr, new Comparator<Info>( ) {			
			@Override
			public int compare(Info arg0, Info arg1) {
				// TODO Auto-generated method stub
				if(arg0.score < arg1.score) 
					return 1;
				else 
					return -1;
				
			}
		});
		
		int result =0;
		for(int i=0; i<5; i++) {
			result += arr.get(i).score;
		}
		System.out.println(result);
		
		PriorityQueue<Integer> que = new PriorityQueue<>();
		for(int i=0; i<5; i++) {
			que.add(arr.get(i).pos);
		}
		for(int i=0; i<5; i++) {
			System.out.print(que.poll());
			if(i == 4)
				System.out.println();
			else
				System.out.print(" ");
		}
		
	}

	static class Info {
		int score;
		int pos;

		public Info(int score, int pos) {
			this.score = score;
			this.pos = pos;
		}
	}

}
