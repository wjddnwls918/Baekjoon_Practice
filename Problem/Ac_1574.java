import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1574 {
	
		static int M;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		M = Integer.parseInt(in.readLine());
		int arr[] = {0,1,2,3};
		int ball[] = {0,1,0,0};
		
		for(int i=0; i<M; i++) {
			String temp[] = in.readLine().split(" ");
			
			int swap1 = Integer.parseInt(temp[0]);
			int swap2 = Integer.parseInt(temp[1]);
			
			if(ball[swap1] == 1) {
				
				ball[swap1] = 0;
				ball[swap2] = 1;
				
				int swap = arr[swap2];
				arr[swap2] = arr[swap1];
				arr[swap1] = swap;				
				
			}else if(ball[swap2] == 1) {
				
				ball[swap2] = 0;
				ball[swap1] = 1;
				
				int swap = arr[swap2];
				arr[swap2] = arr[swap1];
				arr[swap1] = swap;
				
				
			}else {			
				int swap = arr[swap2];
				arr[swap2] = arr[swap1];
				arr[swap1] = swap;
			}
			
		}
		
		for(int i=1; i<=3; i++) {
			if(ball[i] == 1)
			System.out.println(i);
		}
		
	}

}
