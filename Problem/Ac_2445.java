import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_2445 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();

		int N = Integer.parseInt(in.readLine());

		int start = 1;
		int total = (N-start) * 2;
		
		for(int i=0; i<2*N-1; i++) {
			//System.out.println("***total : "+total);
		
			for(int j=0; j<2*N; j++) {
				//System.out.println("check : "+ j);				
				
				if(i==N-1) {
					out.append("*");
					continue;
				}
				
				if(j == start) {
					for(int k=0; k<total; k++ ) {
						out.append(" ");
					}						
					j = j+total-1;
				} else {
					out.append("*");
				}
			}
			
			out.append("\n");
			
			if(i < N-1) {
				start += 1;
			} else {
				start -= 1;
			}
						
			total = (N-start)*2;
		}
		
		System.out.println(out);

	}

}
