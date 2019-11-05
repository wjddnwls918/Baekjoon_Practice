import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_5576 {

	static int W[],K[];
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
		W = new int[10];
		K = new int[10];
		
		for(int i=0; i<10; i++) {
			W[i] = Integer.parseInt(in.readLine());
		}
		for(int i=0; i<10; i++) {
			K[i] = Integer.parseInt(in.readLine());
		}
		
		Arrays.sort(W);
		Arrays.sort(K);
		
		int wTotal = W[7]+W[8]+W[9];
		int kTotal = K[7]+K[8]+K[9];
		
		System.out.println(wTotal +" "+kTotal);
		
	}

}
