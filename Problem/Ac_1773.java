import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_1773 {

		static int check[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		int N,C;
		
		input = in.readLine().split(" ");
		N = Integer.parseInt(input[0]);
		C=  Integer.parseInt(input[1]);
		
		check = new int[C+1];
		for(int i=0;i<N; i++) {
			
			int num = Integer.parseInt(in.readLine());						
			
			for(int j=num; j<=C; j+=num) {				
				check[j] = 1;
			}		
			
		}
		
		int result = 0;
		for(int i=0; i<=C; i++) {
			
			if(check[i] == 1)
				result +=1;
		}
		
		System.out.println(result);
		
	}

}
