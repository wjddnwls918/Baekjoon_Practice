import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2444 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		
		int N = Integer.parseInt(in.readLine());
		
		int size = 2*N - 1;
		
		int start = size / 2;
		int total = 2* (N - start) - 1;
		for(int i=0; i<size; i++) {
			int count = 0;
			for(int j=0; j<size; j++) {
				
				if(count >= total)
					break;
				
				if(j>=start && count < total) {
					out.append("*");
					count+=1;
				} else 
					out.append(" ");
			}
			out.append("\n");
					
			if(i < size / 2) {
				start -=1;
			} else {
				start +=1;
			}
			
			total = 2*(N - start) - 1;
			
		}
		
		
		System.out.println(out);
		
	}

}
