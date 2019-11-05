import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10539 {

	static int b[];
	static int a[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		b = new int[N];
		a = new int[N];
		String input[];
		input = in.readLine().split(" ");
		for(int i=0; i<N; i++) {
			b[i] = Integer.parseInt(input[i]);
		}
		
		int sum = b[0];
		a[0] = b[0];
		for(int i=1; i<N; i++) {
			
			a[i] = ((i+1) * b[i]) - sum; 
			sum+= a[i];
			
		}
		
		for(int i=0; i<N ;i++) {
			System.out.print(a[i]);
			if(i!=N-1)
				System.out.print(" ");
		}
		
	}

}
