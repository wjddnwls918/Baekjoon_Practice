import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ac_2751 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		int N = Integer.parseInt(in.readLine());
		int check[] = new int[2000001];
		for(int i=0; i<N; i++) {
			check[Integer.parseInt(in.readLine()) + 1000000] = 1;
		}
		
		for(int i=0; i<check.length; i++) {
				
			if(check[i] != 0) 
				out.append((i-1000000)+"\n");
		}
		
		System.out.println(out);
		
	}

}


//카운팅 정렬