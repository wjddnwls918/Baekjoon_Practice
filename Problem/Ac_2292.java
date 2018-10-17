import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.InaccessibleObjectException;

public class Ac_2292 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		
		long cnt = 1;
		
		int i;
		for(i=1; cnt < N; i++) {
			cnt = cnt + (6 * i);
		}
		System.out.println(i);
		
	}

}
