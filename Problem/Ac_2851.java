import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2851 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = new int[10];
		for(int i=0; i<10; i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}
		
		
		int result = 0;
		for(int i=0; i< 1<<10; i++) {
			
			int curSum = 0;
			
			boolean start = true;
			for(int j=0; j<10; j++) {				
				
				if(!start)
					break;
				
				if( (i&1<<j) == 1<<j) {					
					curSum += arr[j];
				} else {
					start = false;					
				}
			}
			
			if(Math.abs(result - 100) >= Math.abs(curSum - 100)) {
				
				if(Math.abs(result - 100) == Math.abs(curSum-100)) {
					
					if(result < curSum) {
						result = curSum;
					}
					
				}else {
					result = curSum;
				}
				
			}
			
		}
		
		System.out.println(result);
		
		
	}

}

//슈퍼마리오
//정답