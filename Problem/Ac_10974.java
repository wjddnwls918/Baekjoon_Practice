import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10974 {

	static int N;
	static int permu[];
	static boolean check[];
	
	static StringBuilder out;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		out = new StringBuilder();
		N = Integer.parseInt(in.readLine());
		
		permu = new int[N];
		check = new boolean[N];
		
		for(int i=0; i<N; i++) {
			permu[0] = i+1;
			check[i] = true;
			permutaion(1);
			check[i] = false;
			permu[0] = 0;
		}
		
		System.out.println(out);
	}
	
	public static void permutaion(int depth) {
		
		if(depth==N) {
			
			for(int i=0; i<N; i++) {
				out.append(permu[i]);
				if(i == N-1)
					out.append("\n");
				else
					out.append(" ");
			}
			
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(!check[i]) {
				
				permu[depth] = i+1;
				check[i] = true;
				permutaion(depth+1);
				check[i] = false;
				permu[depth] = 0;
			}
			
		}
		
	}

}
