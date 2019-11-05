import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2953 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		
		int result = -1;
		int max = 0;
		for(int i=0; i<5; i++) {
			input = in.readLine().split(" ");
			int sum = 0;
			for(int j=0; j<input.length; j++) {
				sum += Integer.parseInt(input[j]);
			}
			
			if(max < sum) {
				max = sum;
				result = i+1;
			}
			
		}
		
		
		System.out.println(result +" "+max);
		
	}

}
