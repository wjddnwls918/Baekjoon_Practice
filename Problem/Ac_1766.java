import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Ac_1766 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		
		int N,M;
		input=in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		
		LinkedList<Integer> adjList[] = new LinkedList[N+1];
		for(int i=0; i<=N; i++) {
			adjList[i] = new LinkedList<>();
		}
				
		
		for(int i=0; i<M; i++) {
			input = in.readLine().split(" ");
			int start = Integer.parseInt(input[0]);
			int end = Integer.parseInt(input[1]);
			
			adjList[start].add(end);
						
			
		}
		
		
	}

}
