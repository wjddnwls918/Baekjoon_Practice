import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Ac_2217 {
	
	static int N;
	static Integer num[];
	

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		
		num = new Integer[N];
		for(int i=0; i<N; i++) {
			num[i] = Integer.parseInt(in.readLine());
		}
		
		Arrays.sort(num,Collections.reverseOrder());
		
		int max = 0;
		int j = 1;
		for(int i=0; i<num.length; i++) {
			
			int cur = num[i] * j;
			if(max < cur)
				max = cur;
			
			j+=1;
		}
		
		
		System.out.println(max);
		
		
	}
	


}
