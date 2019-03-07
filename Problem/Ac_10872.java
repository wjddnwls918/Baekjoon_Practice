import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ac_10872 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(in.readLine());
		long fac = 1;
		for(int i=N; i>=1; i--) {
			fac*=i;
		}
		System.out.println(fac);
		
	}

}
