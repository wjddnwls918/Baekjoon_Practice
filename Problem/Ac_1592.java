import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1592 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		input = in.readLine().split(" ");
		
		int N,M,L;
		N = Integer.parseInt(input[0]);
		M = Integer.parseInt(input[1]);
		L = Integer.parseInt(input[2]);
	
		int count[] = new int[N];
		
		
		int curPnt = 0;
		count[curPnt] += 1;
		
		int total = 0;
		while(true) {
						
			if(count[curPnt] % 2== 1) {
				total+=1;
				
				curPnt += L;
				curPnt %= N;
				
				count[curPnt] += 1;
			
				if(count[curPnt] >= M)
					break;
				
			} else {
				total+=1;
				
				curPnt -= L;
				if(curPnt < 0) {
					curPnt += N;
				}
				
				count[curPnt] += 1;
				
				if(count[curPnt] >= M)
					break;
				
			}			
			
		}
		
		System.out.println(total);
		
	}

}
